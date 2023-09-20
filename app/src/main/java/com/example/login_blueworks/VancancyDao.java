package com.example.login_blueworks;

import android.content.Context;
import android.util.Log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//2.0
public class VancancyDao {

    public static final String TAG  =  "CRUD Vancancy";

    public static int isertVancancy(Vancancy mVancancy, Context mContext){

        // 0 Não fez o insert , 1 fez o inset com sucesso
        int vResponse = 0;
        String mSql;
        try{
            mSql = "INSET INTO vancancy (name, status, image) VALUES (?,?,?)";

            PreparedStatement mPreparedStatement = MSSQLConnectionHelper.getConnection(mContext).prepareStatement(mSql);

            mPreparedStatement.setString(1,mVancancy.getmName());
            mPreparedStatement.setInt(2,mVancancy.getmStatus());
            mPreparedStatement.setLong(3,mVancancy.getmImage());

            vResponse = mPreparedStatement.executeUpdate(); // 1 - feito com sucesso


        }catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return vResponse;
    }

    public static int updateVancancy(Vancancy mVancancy, Context mContext){


        int vResponse = 0;
        String mSql;
        try{
            mSql = "UPDATE vancancy SET name=?, status=?, image=? WHERE id=?";

            PreparedStatement mPreparedStatement = MSSQLConnectionHelper.getConnection(mContext).prepareStatement(mSql);

            mPreparedStatement.setString(1,mVancancy.getmName());
            mPreparedStatement.setInt(2,mVancancy.getmStatus());
            mPreparedStatement.setLong(3,mVancancy.getmImage());
            mPreparedStatement.setLong(4,mVancancy.getmId());

            vResponse = mPreparedStatement.executeUpdate(); // 1 - feito com sucesso


        }catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return vResponse;
    }

    public static int deleteVancancy(Vancancy mVancancy, Context mContext){


        int vResponse = 0;
        String mSql;
        try{
            mSql = "DELETE  FROM vancancy  WHERE id=?";

            PreparedStatement mPreparedStatement = MSSQLConnectionHelper.getConnection(mContext).prepareStatement(mSql);

            mPreparedStatement.setLong(1,mVancancy.getmId());

            vResponse = mPreparedStatement.executeUpdate(); // 1 - feito com sucesso


        }catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return vResponse;
    }

    public static List<Vancancy> listAllVancancy(Context mContext){
        List<Vancancy> mVancancyList = null;
        String mSql;

        try{
            mSql = "SELECT id, name , status ,image FROM vancancy ORDER BY name ASC";
            PreparedStatement mpreparedStatement = MSSQLConnectionHelper.getConnection(mContext).prepareStatement(mSql);

            ResultSet mResultSet = mpreparedStatement.executeQuery();
            mVancancyList = new ArrayList<Vancancy>();
            while (mResultSet.next()){
                mVancancyList.add(new Vancancy(
                        mResultSet.getInt(1),
                        mResultSet.getString(2),
                        mResultSet.getInt(3),
                        mResultSet.getLong(4)



                ));
            }

        } catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return mVancancyList;
    }

    public static List<Vancancy> listAllVancancyByStatus( int vStatus,Context mContext){
        List<Vancancy> mVancancyList = null;
        String mSql;

        try{
            mSql = "SELECT id, name , status ,image FROM vancancy WHERE status = "+vStatus +"ORDER BY name ASC";
            PreparedStatement mpreparedStatement = MSSQLConnectionHelper.getConnection(mContext).prepareStatement(mSql);

            ResultSet mResultSet = mpreparedStatement.executeQuery();
            mVancancyList = new ArrayList<Vancancy>();
            while (mResultSet.next()){
                mVancancyList.add(new Vancancy(
                        mResultSet.getInt(1),
                        mResultSet.getString(2),
                        mResultSet.getInt(3),
                        mResultSet.getLong(4)



                ));
            }

        } catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return mVancancyList;
    }

    public static List<Vancancy> searchVancacyByName( String mName,Context mContext){
        List<Vancancy> mVancancyList = null;
        String mSql;

        try{
            mSql = "SELECT id, name , status ,image FROM vancancy WHERE name LIKE '% "+ mName +" %' ORDER BY name ASC";
            PreparedStatement mpreparedStatement = MSSQLConnectionHelper.getConnection(mContext).prepareStatement(mSql);

            ResultSet mResultSet = mpreparedStatement.executeQuery();
            mVancancyList = new ArrayList<Vancancy>();
            while (mResultSet.next()){
                mVancancyList.add(new Vancancy(
                        mResultSet.getInt(1),
                        mResultSet.getString(2),
                        mResultSet.getInt(3),
                        mResultSet.getLong(4)



                ));
            }

        } catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return mVancancyList;
    }

}
