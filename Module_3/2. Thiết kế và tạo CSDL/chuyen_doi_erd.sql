create database chuyen_doi_ERD;
use chuyen_doi_ERD;

create table nha_cung_cap (
	ma_nha_cung_cap int primary key,
    ten_nha_cung_cap varchar(50) not null,
    dia_chi varchar(50) not null
);
create table so_dien_thoai (
	so_dien_thoai varchar(15) primary key,
    ma_nha_cung_cap int,
    foreign key(ma_nha_cung_cap) references nha_cung_cap (ma_nha_cung_cap)
);
create table vat_tu(
	ma_vat_tu int primary key,
    ten_vat_tu varchar(50) not null
);
create table don_dat_hang(
	so_don_hang int primary key,
    ngay_dat_hang date not null,
    ma_nha_cung_cap int not null,
    foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);

create table chi_tiet_don_dat_hang(
	so_don_hang int,
    ma_vat_tu int,
    primary key (so_don_hang, ma_vat_tu),
    foreign key (so_don_hang) references don_dat_hang(so_don_hang),
    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);

create table phieu_nhap(
	so_phieu_nhap int primary key,
    ngay_nhap date
);
create table chi_tiet_phieu_nhap(
	so_phieu_nhap int,
	ma_vat_tu int,
	don_gia_nhap double not null,
    so_luong_nhap int not null,
    primary key(so_phieu_nhap,ma_vat_tu),
    foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap),
    foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table phieu_xuat(
	so_phieu_xuat int primary key,
    ngay_xuat date not null
);
create table chi_tiet_phieu_xuat(
	so_phieu_xuat int,
    ma_vat_tu int,
	don_gia_nhap double not null,
    so_luong_nhap int not null,
    primary key(so_phieu_xuat, ma_vat_tu),
    foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
    foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
