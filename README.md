# CSE702025-N04-Nhom-3

Github nhóm thực hành Kỹ thuật phần mềm lớp N04
## Tên đề tài : phần mềm quản lý sinh viên đơn giản 

Thành viên : 
- Trần Văn Thành
- Đinh Xuân Tài
- Nguyễn Phan Quang Sơn

## Phân tích yêu cầu 
### Vấn đề bài toán 
Dân số việt nam tăng cao đột biến những năm 2000 đến nay lượng sinh viên vào các trường cũng tăng mạnh.
Theo nguồn tin số lượng sinh viên Đại học Phenikaa
- Năm học 2021–2022: 5.493 sinh viên
- Năm học 2022–2023: 9.583 sinh viên → Tăng 74,4% so với năm học trước đó 
- Năm học 2023–2024: Hiện chưa có số liệu chính thức được công bố. Tuy nhiên, theo thông tin tuyển sinh năm 2023, Trường Đại học Phenikaa đặt chỉ tiêu tuyển sinh cho 7.668 sinh viên ở 41 ngành đào tạo .
- Năm học 2024–2025: Chưa có số liệu cụ thể. Tuy nhiên, theo chia sẻ của Hiệu trưởng Trường Đại học Phenikaa, nhà trường đã đầu tư phát triển nhằm đảm bảo năng lực đào tạo tối đa lên đến 25.000 sinh viên .

Qua đó ta có thể thấy việc quản lý là một vấn đề cấp thiết, những năm về trước chúng ta vẫn còn phải thực hiện việc quản lý này một cách thủ công qua sổ sách hay hiện đại hơn là các file word excel.
Ngày nay cồng nghệ thông tin phát triển mạnh mẽ những phần mềm quản lý không còn xa lạ với chúng ta nữa. Phần mềm quản lý sinh viên rất quen thuộc, được xây dựng nhằm hỗ trợ các trường đại học hoặc cơ sở đào tạo quản lý thông tin sinh viên một cách hiệu quả, chính xác, tiện lợi, tự động hóa và giảm đáng kể nhân lực. Hệ thống sẽ giúp lưu trữ, tra cứu, cập nhật các thông tin như hồ sơ sinh viên, quá trình học tập, điểm số, lớp học, khóa học, và các hoạt động liên quan khác.

### Tác nhân người dùngg 
Các tác nhân chính tương tác với hệ thống :
- Quản trị viên: Quản lý toàn bộ hệ thống, tạo tài khoản người dùng, phân quyền.
- Giảng viên: Nhập điểm, theo dõi quá trình học tập của sinh viên.
- Sinh viên: Tra cứu thông tin cá nhân, điểm số, thời khóa biểu, kết quả học tập.

### Chức năng
Quản trị viên:
- Tạo/sửa/xóa tài khoản người dùng.
- Phân quyền truy cập cho các đối tượng khác nhau.

Giảng viên:
- Nhập và cập nhật điểm số sinh viên.
- Xem danh sách sinh viên theo lớp học phần.

Sinh viên:
- Đăng nhập hệ thống.
- Xem thông tin cá nhân, điểm, thời khóa biểu.
- Cập nhật thông tin liên hệ (nếu được phép).


### Dặt tả và thiết kế 
#### 1. Use Case chính:

![image](https://github.com/user-attachments/assets/dc58dac8-7952-4fd1-9680-c35772d32795)

#### 2. Flow
1. UML component diagram
![image](https://github.com/user-attachments/assets/b7471291-2739-4132-80a4-fcb67219df9d)

2. Quản lý sinh viên

![image](https://github.com/user-attachments/assets/2fbb1989-4327-4c7b-9c90-424fc302808e)

3. quản lý điểm

![image](https://github.com/user-attachments/assets/69bb00a7-f69a-439d-b55f-2bd3b5016a74)

4. quản lý môn học

![image](https://github.com/user-attachments/assets/eab1e389-8bfa-4914-9f9c-2d0292c75a1f)

#### 3. Hướng đối tượng 
+----------------+       +------------------+       +--------------+
|    SinhVien    |<>---->|     LopHoc       |<>---->|    MonHoc    |
+----------------+       +------------------+       +--------------+
| - maSV         |       | - maLop          |       | - maMon      |
| - hoTen        |       | - tenLop         |       | - tenMon     |
| - ngaySinh     |       | - danhSachSV     |       | - soTinChi   |
+----------------+       +------------------+       +--------------+

+----------------+
|     Diem       |
+----------------+
| - maSV         |
| - maMon        |
| - diemSo       |
+----------------+

#### 4. UI flow 
[Login]
   ↓
[Dashboard]
   ├─> [QL Sinh viên]
   │     ├─> Thêm
   │     ├─> Sửa
   │     └─> Xóa / Tìm
   ├─> [QL Môn học]
   │     ├─> Thêm
   │     ├─> Sửa
   │     └─> Xóa / Tìm
   └─> [QL Điểm]
         ├─> Nhập điểm
         ├─> Cập nhật điểm
         └─> Xem theo SV / Môn

#### 5. Kiểm tra và đánh giá 

Chức năng	                       Kết quả                       	Ghi chú
Đăng nhập	                         Đạt                   	Hoạt động ổn định
Thêm/sửa/xóa sinh viên	             Đạt                  	Dữ liệu được cập nhật đúng
Quản lý môn học	                   Đạt	                  Có thể thao tác dễ dàng
Nhập và tính điểm	                   Đạt	                  Tính toán điểm chính xác
Xếp loại học lực	                   Đạt	                  Phân loại đúng theo điểm tổng kết
Giao diện người dùng	                Tốt	                  Thân thiện, dễ sử dụng
Tốc độ phản hồi	                   Tốt	                  Không gặp tình trạng chậm, lag
Lỗi phát sinh	                   Không đáng kể           	Không có lỗi nghiêm trọng nào
