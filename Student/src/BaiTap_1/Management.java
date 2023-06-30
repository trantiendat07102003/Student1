package BaiTap_1;
import java.util.ArrayList;


public class Management {
	
	private ArrayList<Student> list;
	
	public Management() {
		this.list = new ArrayList<Student>();
	}
	
	public void input() {
		// Phương thức này dùng để nhập dữ liệu cho sinh viên và tạo ra đối tượng Student để gọi đến phương thức insert để thêm sinh viên vào danh sách quản lý, nếu đối tượng Student có mã số đã tồn tại thì gọi đén phương thức update để cập nhật thông tin đối tượng
	}
	
	public void insert(Student s) {
		// Phương thức này dùng để thêm đối tượng Student vào danh sách quản lý
	}
	
	public void update(Student s) {
		// Phương thức này dùng để cập nhật thông tin đối tượng Student trong danh sách đang quản lý
	}
	
	public void delete(int id) {
		// Phương thức này dùng để xóa đối tượng sinh viên theo id
	}
	
	public Student search(int id) {
		// Phương thức này dùng để tìm kiếm và trả về đối tượng Student theo id
		return null;
	}
	
	public void display() {
		// Phương thức này dùng để in ra thông tin của toàn bộ đối tượng Student đang quản lý
	}

}
