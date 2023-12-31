package com.example.duan_bandienthoai.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "BanDienThoai", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dbNguoiDung = "CREATE TABLE NGUOIDUNG(manguoidung text primary key , hoten text , matkhau text,loaitaikhoan text)";
        db.execSQL(dbNguoiDung);
        db.execSQL("INSERT INTO NGUOIDUNG VALUES ('thuthu01' , 'Nguyễn Văn A','123','nhanvien'),('admin' , 'Nguyễn Công Phương','1','admin') ");


        String sql  = "CREATE TABLE DIENTHOAI (id integer primary key autoincrement , tendt text , giadt integer,anh text,mota text)";
        db.execSQL(sql);

        String data = "INSERT INTO DIENTHOAI VALUES (1,'samsung Galaxy A23' , 15999999,'anhdienthoai1','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM')," +
                "(2,'redmi' , 17000000,'anhdienthoai2','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM')," +
                "(3,'samsung galaxy A33 5G' , 19999999,'anhdienthoai','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM')," +
                "(4,'iphone 13' , 15999999,'iphone13','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM') ," +
                "(5,'oppo reno8 T 5G' , 14999999,'anhdienthoai','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM') ," +
                "(6,'galaxy utra' , 12999999,'anhdienthoai','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM')," +
                "(7,'galaxy z flip5' , 17999999,'anhdienthoai3','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM') ," +
                "(8,'galaxy s23 ultra' , 20999999,'anhdienthoai4','Bộ xử lý: Intel Core i5 dual-core 3.1GHz, Turbo Boost up to 3.5GHz, with 64MB of eDRAM')   ";
        db.execSQL(data);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS NGUOIDUNG ");
            db.execSQL("DROP TABLE IF EXISTS DIENTHOAI ");
            onCreate(db);


        }
    }
}
