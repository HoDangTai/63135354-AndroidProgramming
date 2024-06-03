package ntu.tai_63135354.ontapcuoiki;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Question4Fragment extends Fragment {
    ListView lvSach;
    ArrayAdapter<String> bo_nguon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question4, container, false);

        // Bước 0. Tạo file cơ sở dữ liệu
        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", // tên file = tên DB
                android.content.Context.MODE_PRIVATE,  // giới hạn truy cập
                null          // con trỏ bản ghi
        );
        // B1. Tạo bảng
        // câu lêệnh tạo bảng
        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Books;";

        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                "BookName text, " +
                "Page integer, " +
                "Price Float, " +
                "Description text);";
        // thực hiện lệnh sql
        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'sách về java');";
        String sqlThem2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
        String sqlThem3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');";
        String sqlThem4 = "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
        String sqlThem5 = "INSERT INTO Books VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);

        String sqlSelect = "Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect, null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên
        // B3: Đổ vào biến nào đó để xử lý
        // 3.1. Xây dựng model/class cho bảng Books, ví dụ: Book.java
        // 3.2. Tạo biến ArrayList<Book> dsSach;
        ArrayList<Book> dsSach = new ArrayList<>();
        // 3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (!cs.isAfterLast()) { // còn bản ghi để chuyển tới
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int idSach = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            // Tạo một đối tượng sách và thêm vào danh sách
            Book b = new Book(idSach, tenSach, soTrang, gia, mota);
            dsSach.add(b);
            cs.moveToNext();
        }
        cs.close();
        // B4, Hiện lên listview, recylerview,..
        ArrayList<String> dsTenSach = new ArrayList<>();
        for (Book book : dsSach) {
            dsTenSach.add(book.getBookName());
        }

        lvSach = view.findViewById(R.id.lvSach);
        bo_nguon = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, dsTenSach);
        lvSach.setAdapter(bo_nguon);

        db.close();

        return view;
    }
}