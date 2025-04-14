package com.example.slip11;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CustomerDB";
    private static final String TABLE_NAME = "Customer";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_ADDRESS = "address";
    private static final String COL_PHONE = "phn";
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_NAME + " TEXT, " +
                COL_ADDRESS + " TEXT, " +
                COL_PHONE + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertCustomer(String name, String address, String phone) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_NAME, name);
        values.put(COL_ADDRESS, address);
        values.put(COL_PHONE, phone);

        long result = db.insert(TABLE_NAME, null, values);
        return result != -1;
    }

    public void showAllCustomers() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        StringBuilder sb = new StringBuilder();

        if (cursor.getCount() == 0) {
            Toast.makeText(context, "No Customers Found!", Toast.LENGTH_SHORT).show();
            return;
        }

        while (cursor.moveToNext()) {
            sb.append("ID: ").append(cursor.getInt(0)).append("\n");
            sb.append("Name: ").append(cursor.getString(1)).append("\n");
            sb.append("Address: ").append(cursor.getString(2)).append("\n");
            sb.append("Phone: ").append(cursor.getString(3)).append("\n\n");
        }
        cursor.close();

        // Call the function to display a large toast
        showLargeToast(sb.toString());
    }

    private void showLargeToast(String message) {
        // Create a Custom Toast Layout
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);

        // Inflate custom layout for Toast
        View customView = View.inflate(context, R.layout.custom_toast, null);
        TextView textView = customView.findViewById(R.id.toastTextView);
        textView.setText(message);

        toast.setView(customView);
        toast.show();
    }

}
