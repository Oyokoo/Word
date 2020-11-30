//package com.example.word;
//
//import android.database.Cursor;
//import android.provider.MediaStore;
//import android.util.Log;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SearchFile {
//
//    private List<FileItem> getAllText() {
//
//        List<FileItem> texts = new ArrayList<>();
//
//        String[] projection = new String[]{MediaStore.Files.FileColumns._ID, MediaStore.Files.FileColumns.DATA, MediaStore.Files.FileColumns.TITLE, MediaStore.Files.FileColumns.MIME_TYPE};
//
//        //相当于我们常用sql where 后面的写法
//        String selection = MediaStore.Files.FileColumns.MIME_TYPE + "= ? "
//                + " or " + MediaStore.Files.FileColumns.MIME_TYPE + " = ? "
//                + " or " + MediaStore.Files.FileColumns.MIME_TYPE + " = ? "
//                + " or " + MediaStore.Files.FileColumns.MIME_TYPE + " = ? "
//                + " or " + MediaStore.Files.FileColumns.MIME_TYPE + " = ? ";
//
//        String[] selectionArgs = new String[]{"text/plain", "application/msword", "application/pdf", "application/vnd.ms-powerpoint", "application/vnd.ms-excel"};
//
//        Cursor cursor = mContentResolver.query(MediaStore.Files.getContentUri("external"), projection, selection, selectionArgs, MediaStore.Files.FileColumns.DATE_MODIFIED + " desc");
//
//
//        String fileId;
//
//        String fileName;
//
//        String filePath;
//
//        while (cursor.moveToNext()) {
//
//            fileId = cursor.getString(cursor.getColumnIndex(MediaStore.Files.FileColumns._ID));
//
//            fileName = cursor.getString(cursor.getColumnIndex(MediaStore.Files.FileColumns.TITLE));
//
//            filePath = cursor.getString(cursor.getColumnIndex(MediaStore.Files.FileColumns.DATA));
//
//
//            Log.e("ryze_text", fileId + " -- " + fileName + " -- " + "--" + cursor.getString(cursor.getColumnIndex(MediaStore.Files.FileColumns.MIME_TYPE)) + filePath);
//
//            FileItem fileItem = new FileItem(fileId, filePath, fileName);
//
//            texts.add(fileItem);
//
//        }
//
//
//        cursor.close();
//        cursor = null;
//
//
//        return texts;
//
//    }
//}
