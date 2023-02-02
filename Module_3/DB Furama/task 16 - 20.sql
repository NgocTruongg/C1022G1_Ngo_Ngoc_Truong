use furama;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

-- SET SQL_SAFE_UPDATES = 0; -- biến cờ
delete from nhan_vien 
where ma_nhan_vien not in
(select ma_nhan_vien from hop_dong hd
where year (hd.ngay_lam_hop_dong) between 2019 and 2021
);

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng 
-- 		đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.



-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

set foreign_key_checks = 0;
delete from khach_hang 
where ma_khach_hang in 
(select ma_khach_hang from hop_dong hd
where year (hd.ngay_lam_hop_dong) < 2021
);
select ma_khach_hang, ho_va_ten
from khach_hang;

-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.

-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id 
-- 		(ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
