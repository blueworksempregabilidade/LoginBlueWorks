package com.example.login_blueworks;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSSQLConnectionHelper {

    public static final String TAG ="Connection Database";

    private static String mStringConnectionUrl;

    private static String mStringServeripName = "meubancotcc.mssql.Somee.com";

    private static String mStringUserName = "blueworkstccv16_user";

    private static String mStringPassword = "ci6RIcO5tt8J0l6ehw1gZ0xGLT4hNGaf";

    private static String mStringDatabase = "blueworkstccv16";


    public static Connection getConnection(Context mContext){
      Connection mConnection = null;

      try{
              StrictMode.ThreadPolicy mPolicy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
              StrictMode.setThreadPolicy(mPolicy);

          //    Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //  mStringConnectionUrl = "jdbc:jtds:sqlserver://" + mStringServeripName + ";databaseName="+
            //          mStringDatabase + ";user=" + mStringUserName + ";password=" + mStringPassword + ";";
 //             mConnection = DriverManager.getConnection(mStringConnectionUrl);



          Class.forName("org.postgresql.Driver");
//              mConnection = DriverManager.getConnection("jdbc:postgresql://domain.com:5432/blueworkstccv16", "blueworkstccv16_user", "ci6RIcO5tt8J0l6ehw1gZ0xGLT4hNGaf");
              mConnection = DriverManager.getConnection("jdbc:postgresql://dpg-cilkrplgkuvinflboiig-a.oregon-postgres.render.com:5432/blueworkstccv16", "blueworkstccv16_user", "ci6RIcO5tt8J0l6ehw1gZ0xGLT4hNGaf");



              Log.i(TAG,"Connection Successful");

      } catch (ClassNotFoundException e){
          String mMessage = "Class Not Found" + e.getMessage();
          Log.e(TAG, mMessage);
      } catch (SQLException e){
          String mMessage = "Database Fail" + e.getMessage();
          Log.e(TAG, mMessage);
      }catch (Exception e){
          String mMessage = "Failure Unknown" + e.getMessage();
          Log.e(TAG, mMessage);
      }

        return mConnection;

    }

}
