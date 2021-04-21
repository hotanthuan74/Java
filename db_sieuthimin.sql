-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 21, 2021 lúc 11:26 AM
-- Phiên bản máy phục vụ: 10.4.17-MariaDB
-- Phiên bản PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `db_sieuthimin`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_chitiethoadon`
--

CREATE TABLE `tbl_chitiethoadon` (
  `id_hoadon` int(11) NOT NULL,
  `id_sanpham` int(11) NOT NULL,
  `soluong` int(11) NOT NULL,
  `gia` double NOT NULL,
  `phantram_km` double NOT NULL,
  `tongtien_loaisanpham` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_chitietkhuyenmai`
--

CREATE TABLE `tbl_chitietkhuyenmai` (
  `id_khuyenmai` int(11) NOT NULL,
  `id_sanpham` int(11) NOT NULL,
  `phantram_km` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_chitietphieunhaphang`
--

CREATE TABLE `tbl_chitietphieunhaphang` (
  `id_phieunhaphang` int(11) NOT NULL,
  `id_sanpham` int(11) NOT NULL,
  `soluongnhap` int(11) NOT NULL,
  `dongianhap` double NOT NULL,
  `tongtien_pnh` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_dangnhap`
--

CREATE TABLE `tbl_dangnhap` (
  `id_nhanvien` int(11) NOT NULL,
  `matkhau` varchar(50) NOT NULL,
  `tendangnhap` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tbl_dangnhap`
--

INSERT INTO `tbl_dangnhap` (`id_nhanvien`, `matkhau`, `tendangnhap`) VALUES
(4001, 'admin', 'admin'),
(4006, 'nhanvien', 'nhanvien');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_hoadon`
--

CREATE TABLE `tbl_hoadon` (
  `id_hoadon` int(20) NOT NULL,
  `id_nhanvien` int(20) NOT NULL,
  `id_khachhang` int(20) NOT NULL,
  `id_khuyenmai` int(20) NOT NULL,
  `ngay_lap` date NOT NULL,
  `tong_hoadon` double NOT NULL,
  `giolap_hoadon` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_khachhang`
--

CREATE TABLE `tbl_khachhang` (
  `id_khachhang` int(11) NOT NULL,
  `ten_kh` varchar(50) NOT NULL,
  `ho_kh` varchar(50) NOT NULL,
  `diachi_kh` varchar(50) NOT NULL,
  `sdt_kh` int(11) NOT NULL,
  `email_kh` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_khuyenmai`
--

CREATE TABLE `tbl_khuyenmai` (
  `id_khuyenmai` int(11) NOT NULL,
  `ngaybd_km` date NOT NULL,
  `ngaykt_km` date NOT NULL,
  `noidung_km` varchar(50) NOT NULL,
  `ten_km` varchar(100) NOT NULL,
  `phantram_km` double NOT NULL,
  `dieukien_km` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_loaisanpham`
--

CREATE TABLE `tbl_loaisanpham` (
  `id_loaisanpham` int(11) NOT NULL,
  `ten_lsp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tbl_loaisanpham`
--

INSERT INTO `tbl_loaisanpham` (`id_loaisanpham`, `ten_lsp`) VALUES
(213, 'Đông lạnh'),
(214, 'Bánh kẹo'),
(215, 'Đồ uống'),
(216, 'Thức ăn nhanh'),
(217, 'Đồ hộp'),
(218, 'Gia vị'),
(219, 'Đã sơ chế'),
(220, 'Thực phẩm khô'),
(221, 'Văn phòng phẩm'),
(222, 'Mẹ và bé'),
(223, 'Gia dụng'),
(224, 'Mỹ phẩm'),
(225, 'Hóa phẩm'),
(226, 'Đồ cùng cá nhân'),
(227, 'Lương thực'),
(228, 'Sữa');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nhacungcap`
--

CREATE TABLE `tbl_nhacungcap` (
  `id_nhacungcap` int(11) NOT NULL,
  `ten_ncc` varchar(50) NOT NULL,
  `diachi_ncc` varchar(50) NOT NULL,
  `sdt_ncc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nhanvien`
--

CREATE TABLE `tbl_nhanvien` (
  `id_nhanvien` int(11) NOT NULL,
  `ten_nv` varchar(50) NOT NULL,
  `ho_nv` varchar(50) NOT NULL,
  `diachi_nv` varchar(50) NOT NULL,
  `sdt_nv` int(11) NOT NULL,
  `tuoi_nv` int(11) NOT NULL,
  `chucvu_nv` varchar(50) NOT NULL,
  `luong_nv` double NOT NULL,
  `gioitinh_nv` varchar(50) NOT NULL,
  `trangthai_nv` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tbl_nhanvien`
--

INSERT INTO `tbl_nhanvien` (`id_nhanvien`, `ten_nv`, `ho_nv`, `diachi_nv`, `sdt_nv`, `tuoi_nv`, `chucvu_nv`, `luong_nv`, `gioitinh_nv`, `trangthai_nv`) VALUES
(4001, 'Thiệnn', 'Vũ Quý', 'TPHCM', 523923765, 20, 'Admin', 2000, 'Nam', ''),
(4002, 'Thuận', 'Phạm Tấn', 'TPHCM', 948040243, 20, 'Admin', 2000, 'Nam', ''),
(4003, 'Nghĩa', 'Trần Văn', 'TPHCM', 125558881, 20, 'Admin', 2000, 'Nam', ''),
(4004, 'Quang', 'Nguyễn', 'TPHCM', 11231234, 20, 'Admin', 2000, 'Nam', ''),
(4005, 'Kiệt', 'Trần ', 'TPHCM', 165321486, 20, 'Admin', 2000, 'Nam', ''),
(4006, 'Anh', 'Ngọc', 'Bạc Liêu', 933726604, 18, 'nv', 100, 'Nữ', ''),
(4008, 'Linh', 'Khánh', 'Hà Nội', 779588956, 18, 'Tiếp thị', 200, 'Nam', ''),
(4009, 'Lê', 'My', 'Tây Ninh', 913546900, 18, 'Thu ngân', 200, 'Nữ', ''),
(4010, 'Lam', 'Nguyễn', 'Bạc Liêu', 817727555, 19, 'Tư vấn', 200, 'Nữ', ''),
(4012, 'Văn', 'Công', 'Bình Dương', 913546900, 18, 'Lao Công', 200, 'Nữ', ''),
(4013, 'Vân', 'Lê', 'Cần Thơ', 913546900, 18, 'Thu ngân', 200, 'Nữ', ''),
(4018, 'Đạt', 'Nguyễn', 'TPHCM', 562315125, 20, 'Bảo vệ', 1000, 'Nam', ''),
(4019, 'Vy', 'Nguyễn', 'Vũng Tàu', 562154321, 32, 'Quản lý', 1000, 'Nam', ''),
(4021, 'Tuấn', 'Minh', 'Vũng Tàu', 123648123, 20, 'thu ngân', 3000, 'Nam', ''),
(4022, 'Kha', 'Minh', 'Daklak', 561312486, 20, 'Quản lý nhân sự', 4000, 'Nam', ''),
(4023, 'Nhật', 'Vũ', 'Đà Nẵng', 163123448, 20, 'Bảo vệ', 2000, 'Nữ', ''),
(4024, 'Phương', 'Đỗ', 'TPHCM', 156321485, 22, 'Quản lý kho', 3000, 'Nữ', ''),
(4026, 'Hiền', 'Cu To', '696969', 123549368, 69, 'Thái giám', 10000, 'Nữ', ''),
(4028, 'Hoàng', 'Vũ', 'Vũng tàu', 652153215, 21, 'Admin', 2000, 'Nam', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phieunhaphang`
--

CREATE TABLE `tbl_phieunhaphang` (
  `id_phieunhaphang` int(11) NOT NULL,
  `id_nhanvien` int(11) NOT NULL,
  `id_nhacungcap` int(11) NOT NULL,
  `ngaynhap_pnh` date NOT NULL,
  `tongtien_pnh` double NOT NULL,
  `giolap_pnh` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_sanpham`
--

CREATE TABLE `tbl_sanpham` (
  `id_sanpham` int(11) NOT NULL,
  `id_loaisanpham` int(11) NOT NULL,
  `dongia_sp` double NOT NULL,
  `soluong_sp` int(11) NOT NULL,
  `donvitinh_sp` varchar(50) NOT NULL,
  `ten_sp` varchar(50) NOT NULL,
  `trangthai_sp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tbl_sanpham`
--

INSERT INTO `tbl_sanpham` (`id_sanpham`, `id_loaisanpham`, `dongia_sp`, `soluong_sp`, `donvitinh_sp`, `ten_sp`, `trangthai_sp`) VALUES
(3000, 228, 24000, 30, 'Lốc', 'Sữa milo', ''),
(3001, 228, 21000, 40, 'Lốc', 'Sữa TH true milk', ''),
(3002, 228, 22000, 35, 'Lốc', 'Sữa Fami', ''),
(3003, 228, 22000, 20, 'Lốc', 'Sữa nestle', ''),
(3004, 228, 21000, 10, 'Lốc', 'Sữa Óc chó', ''),
(3005, 214, 10000, 10, 'Gói', 'Socola Kitkat', ''),
(3006, 214, 55000, 20, 'Hộp', 'Bánh Chocopie', ''),
(3007, 214, 2000, 50, 'Gói', 'Bánh gạo One One', ''),
(3008, 214, 10000, 10, 'Gói', 'Socola Kitkat', ''),
(3009, 214, 55000, 20, 'Hộp', 'Bánh Chocopie', ''),
(3010, 214, 2000, 50, 'Gói', 'Bánh gạo One One', ''),
(3011, 214, 27500, 15, 'hộp', 'Bánh AFC', ''),
(3012, 214, 8000, 15, 'Gói', 'Banh OREO vị Vani', ''),
(3013, 214, 8000, 10, 'Gói', 'Bánh OREO vị Dâu', ''),
(3014, 214, 8000, 15, 'Gói', 'Bánh OREO vị Socola', ''),
(3015, 214, 6000, 10, 'Gói', 'Snack OiShi tôm cay', ''),
(3016, 214, 6000, 10, 'Gói', 'Snack OiShi Tomato', ''),
(3017, 214, 6000, 10, 'Gói', 'Snack OiShi Bí đỏ', ''),
(3018, 214, 6000, 10, 'Gói', 'Snack OiShi Phô mát ', ''),
(3019, 214, 6000, 10, 'Gói', 'Snack OiShi bắp', ''),
(3020, 214, 10000, 10, 'Gói', 'Socola Kitkat', ''),
(3021, 214, 55000, 20, 'Hộp', 'Bánh Chocopie', ''),
(3022, 214, 2000, 50, 'Gói', 'Bánh gạo One One', ''),
(3023, 214, 27500, 15, 'hộp', 'Bánh AFC', ''),
(3024, 214, 8000, 15, 'Gói', 'Banh OREO vị Vani', ''),
(3025, 214, 8000, 10, 'Gói', 'Bánh OREO vị Dâu', ''),
(3026, 214, 8000, 15, 'Gói', 'Bánh OREO vị Socola', ''),
(3027, 214, 6000, 10, 'Gói', 'Snack OiShi tôm cay', ''),
(3028, 214, 6000, 10, 'Gói', 'Snack OiShi Tomato', ''),
(3029, 214, 6000, 10, 'Gói', 'Snack OiShi Bí đỏ', ''),
(3030, 214, 6000, 10, 'Gói', 'Snack OiShi Phô mát ', ''),
(3031, 214, 6000, 10, 'Gói', 'Snack OiShi bắp', ''),
(3032, 214, 10000, 15, 'Gói', 'Snack Poca khoai tây tự nhiên', ''),
(3033, 214, 10000, 10, 'Gói', 'Snack Poca khoai tay vị sườn nướng', ''),
(3034, 214, 10000, 10, 'Gói', 'Snack Poca khoai tây vị rong biển', ''),
(3035, 214, 12000, 10, 'Gói', 'Snack Swing vị sườn', ''),
(3036, 214, 8000, 10, 'Gói', 'Snack Lays vị BBQ', ''),
(3037, 214, 20000, 10, 'Hộp', 'Doublemint viên', ''),
(3038, 214, 15000, 10, 'Hộp', 'Doublemint gum', ''),
(3039, 214, 5000, 9, 'Hộp', 'Kẹo kem dừa', ''),
(3040, 214, 25000, 10, 'Hộp', 'Bánh Nabati (hộp lớn)', ''),
(3041, 214, 3000, 10, 'Gói', 'Bánh Nabati (5 Thanh)', ''),
(3042, 214, 20000, 10, 'Gói', 'Kẹo Oshi vị ổi', ''),
(3043, 214, 20000, 10, 'Gói', 'Kẹo Oshi vị chanh', ''),
(3044, 214, 25000, 10, 'Gói', 'Kẹo Bạc hà FresBarley', ''),
(3045, 214, 30000, 10, 'Gói', 'Kẹo Bạc hà Socola', ''),
(3046, 228, 6000, 24, 'Hộp', 'Sữa chua Vinamilk', ''),
(3047, 228, 16000, 20, 'Hộp', 'Sữa chua Nếp cẩm', ''),
(3048, 228, 7000, 24, 'Hộp', 'Sữa chua TH true milk', ''),
(3049, 228, 6000, 24, 'Hộp', 'Sữa chua Lựu đỏ', ''),
(3050, 228, 7000, 24, 'Hộp', 'Sữa chua Nha Đam', ''),
(3051, 228, 6000, 24, 'Hộp', 'Sữa chua Dâu', ''),
(3052, 228, 7000, 32, 'Hộp', 'Sữa Yomost vị dâu', ''),
(3053, 228, 7000, 32, 'Hộp', 'Sữa Yomost vị việt quất', ''),
(3054, 228, 7000, 32, 'Hộp', 'Sữa Yomost vị cam', ''),
(3055, 228, 53000, 25, 'Chai', 'Sữa Yakult(400ml)', ''),
(3056, 228, 5000, 25, 'Chai', 'Sữa Yakult(65ml)', ''),
(3057, 228, 25000, 25, 'Lốc', 'Sữa Yakult(65mlx5', ''),
(3058, 228, 53000, 25, 'Chai', 'Sữa Betagen(400ml)', ''),
(3059, 228, 37000, 25, 'Chai', 'Sữa Betagen(300ml)', ''),
(3060, 228, 17000, 25, 'Chai', 'Sữa Betagen(140ml)', ''),
(3061, 228, 20000, 25, 'Hộp', 'Sữa Banana vị chuối', ''),
(3062, 228, 20000, 25, 'Hộp', 'Sữa Banana vị dâu', ''),
(3063, 228, 20000, 25, 'Hộp', 'Sữa Banana vị dưa lưới', ''),
(3064, 228, 6000, 24, 'Hộp', 'Sữa chưa Vinamilk', ''),
(3065, 218, 21000, 20, 'Gói', 'Đường trắng (1kg)', ''),
(3066, 218, 24000, 20, 'Gói', 'Đường vàng (1kg)', ''),
(3067, 218, 60000, 20, 'Hộp', 'Đường ăn kiêng (250g)', ''),
(3068, 218, 59000, 20, 'Hộp', 'Tiêu đen Phú Quốc (40g)', ''),
(3069, 218, 21000, 20, 'Chai', 'Dầu ăn Tường An (1L)', ''),
(3070, 218, 45000, 20, 'Gói', 'Dầu Olive (250ml)', ''),
(3071, 218, 12000, 20, 'Chai', 'Tương ớt Chinsu', ''),
(3072, 218, 12000, 20, 'Chai', 'Tương ớt Chinsu siêu cay', ''),
(3073, 218, 5000, 20, 'Gói', 'Ngũ vị hương', ''),
(3074, 218, 12000, 20, 'Gói', 'Tương cà Chisu', ''),
(3075, 218, 168000, 20, 'Gói', 'Nước mắm cá cơm(5L)', ''),
(3076, 218, 98000, 20, 'Gói', 'Nước mắm cốt Phú Quốc(520ML)', ''),
(3077, 218, 6000, 20, 'Gói', 'Muối (500g)·', ''),
(3078, 218, 12000, 20, 'Gói', 'Bột ngọt (150g)', ''),
(3079, 218, 168000, 20, 'Gói', 'Bột ngọt (500g)', ''),
(3080, 217, 32000, 10, 'Hộp', 'Thịt hộp Span ', ''),
(3081, 217, 18000, 10, 'Hộp', 'Cá ngừ sốt cay Tuna (140g)', ''),
(3082, 217, 162000, 10, 'Hộp', 'Thịt vai heo Extra Tulip hộp 454g', ''),
(3083, 217, 24000, 10, 'Hộp', 'Thịt heo hầm Master T hộp 180g', ''),
(3084, 217, 72000, 10, 'Hộp', 'Thịt bò hầm gia vị Vissan hộp 397g', ''),
(3085, 217, 39000, 10, 'Hộp', 'Bò nấu đậu trắng Vissan hộp 280g', ''),
(3086, 217, 12000, 10, 'Hộp', 'Cá nục sốt cà đậm đà 3 Cô Gái 155g', ''),
(3087, 215, 8000, 50, 'Chai', 'Pepsi (390ml)', ''),
(3088, 215, 8000, 60, 'Chai', 'Mirinda Xá xị (390ml)', ''),
(3089, 215, 8000, 60, 'Chai', 'Cocacola (390ml)', ''),
(3090, 215, 9000, 60, 'Chai', 'Revive (500ml)', ''),
(3091, 215, 9000, 60, 'Chai', 'Revive chanh muối (500ml)', ''),
(3092, 215, 9000, 60, 'Chai', 'Sprite (600ml)', ''),
(3093, 215, 9000, 60, 'Chai', 'Warrior vị nho (500ml)', ''),
(3094, 215, 9000, 60, 'Chai', '7Up (390ml)', ''),
(3095, 215, 10000, 60, 'Lon', 'Redbull (390ml)', ''),
(3096, 215, 7000, 60, 'Chai', 'Number1 (390ml)', ''),
(3097, 222, 350000, 15, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3098, 222, 430000, 15, 'Gói', 'Tã em bé (cỡ lớn)', ''),
(3099, 222, 180000, 15, 'Gói', 'Tã em bé (cỡ nhỏ)', ''),
(3100, 222, 205000, 20, 'Chai', 'Sữa tắm gội cho bé Cetaphil Bay ( 400ml )', ''),
(3101, 222, 45000, 20, 'tuýp', 'Kem đánh răng cho trẻ từ 1 tuổi Lion Strawbery', ''),
(3102, 222, 275000, 20, 'Hộp', 'Sữa bột em bé Similac Newborn Eye-Q ( 400g)', ''),
(3103, 222, 539000, 20, 'Hộp', 'Sữa bột em bé Similac Newborn Eye-Q ( 900g )', ''),
(3104, 222, 155000, 20, 'Hộp', 'Sữa bột Dielac Alpha 1 Gold( 400g)', ''),
(3105, 222, 205000, 20, 'Hộp', 'Sữa bột Dielac Alpha (900g)', ''),
(3106, 222, 85000, 10, 'Chai', 'Dầu gội em bé Không kích ứng Nuagé', ''),
(3107, 222, 125000, 10, 'Chai', 'Dầu gội cho bé Johnsons Baby', ''),
(3108, 222, 13000, 20, 'Cây', 'Bàn chải đánh răng cho trẻ em ', ''),
(3109, 222, 119000, 25, 'Gói', 'Bỉm tã dán quần YOULI cho bé ', ''),
(3110, 222, 165000, 15, 'Chai', 'Xịt vệ sinh răng Hamikea cho bé từ 28 tháng trở lê', ''),
(3111, 222, 4650000, 10, 'Cái', 'Balo bĩm sữa đa chức năng', ''),
(3112, 222, 199000, 20, 'Gói', 'Thau chậu tắm gấp gọn cho bé', ''),
(3113, 222, 150000, 10, 'Gói', 'Miếng lót thấm sữa ChuChu Baby ( lớn)', ''),
(3114, 222, 90000, 10, 'Gói', 'Miếng lót thấm sữa ChuChu Baby ( vừa )', ''),
(3115, 222, 79000, 10, 'Gói', 'Miếng lót thấm sữa ChuChu Baby ( nhỏ)', ''),
(3116, 222, 170000, 10, 'can', 'Nước giặt quần áo cho bé D-Nee (3 lít)', ''),
(3117, 222, 50000, 10, 'Túi', 'Nước giặt quần áo cho bé D-Nee(600g)', ''),
(3118, 222, 68000, 10, 'Chai', 'Nước rửa bình sữa D-Nee', ''),
(3119, 222, 39000, 15, 'hộp', 'Gạc rơ lưỡi trẻ em Hanomed', ''),
(3120, 222, 300000, 10, 'Máy', 'Máy hâm sữa Fatz Baby', ''),
(3121, 222, 235000, 10, 'Hộp', ' Sữa Enfamama A+ hương chocolate', ''),
(3122, 222, 235000, 20, 'Hộp', 'Sữa Enfamama A+ hương vani', ''),
(3123, 222, 439000, 20, 'Hộp', 'Sữa bầu Similac Mom hương vani 900g', ''),
(3124, 222, 185000, 20, 'Hộp', 'Sữa bầu Similac Mom hương vani 400g', ''),
(3125, 222, 230000, 10, 'Đai', 'Đai hổ trợ bụng bầu ( đủ size', ''),
(3126, 222, 420000, 15, 'Tuýp', 'Kem chống rạn da ', ''),
(3127, 222, 459000, 20, 'Túi', 'Bộ sản phẩm 22 món cho mẹ và bé', ''),
(3128, 222, 189000, 25, 'Giỏ', 'Giỏ đựng đồ sơ sinh- làn đi sinh cho mẹ và bé', ''),
(3129, 222, 175000, 30, 'Túi', 'Túi trữ sữa hãng Babuu 250ml', ''),
(3130, 222, 99000, 25, 'Tuýp', 'Kem dưỡng da, dưỡng ẩm cho cả mẹ và bé', ''),
(3131, 222, 115000, 20, 'Bộ', 'Bộ gối nằm và gói chặn cao cấp  cho bé', ''),
(3132, 222, 145000, 20, 'Gói', 'Bông vệ sinh cắt miếng cho mẹ và bé', ''),
(3133, 222, 269000, 15, 'Bình', 'Bình sữa chống sặc Oberni cổ rộng co tay cầm', ''),
(3134, 222, 51000, 10, 'Bình', 'Bình sữa PP cổ thường', ''),
(3135, 222, 51000, 10, 'Bình', 'Bình sữa PP cổ hẹp', ''),
(3136, 222, 19000, 10, 'Cái', 'Núm ti chỉnh nha NIP nhập khẩu', ''),
(3137, 222, 55000, 15, 'Cái', 'Núm bình cổ hẹp', ''),
(3138, 222, 5000, 10, 'Cái', 'Núm bình cổ rộng', ''),
(3139, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3140, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3141, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3142, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3143, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3144, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3145, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3146, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3147, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3148, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3149, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3150, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', ''),
(3151, 222, 350000, 10, 'Gói', 'Tã em bé (cỡ vừa)', '');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tbl_chitiethoadon`
--
ALTER TABLE `tbl_chitiethoadon`
  ADD KEY `id_hoadon` (`id_hoadon`),
  ADD KEY `id_sanpham` (`id_sanpham`);

--
-- Chỉ mục cho bảng `tbl_chitietkhuyenmai`
--
ALTER TABLE `tbl_chitietkhuyenmai`
  ADD KEY `id_khuyenmai` (`id_khuyenmai`),
  ADD KEY `id_sanpham` (`id_sanpham`);

--
-- Chỉ mục cho bảng `tbl_chitietphieunhaphang`
--
ALTER TABLE `tbl_chitietphieunhaphang`
  ADD KEY `id_phieunhaphang` (`id_phieunhaphang`),
  ADD KEY `id_sanpham` (`id_sanpham`);

--
-- Chỉ mục cho bảng `tbl_dangnhap`
--
ALTER TABLE `tbl_dangnhap`
  ADD KEY `id_nhanvien` (`id_nhanvien`);

--
-- Chỉ mục cho bảng `tbl_hoadon`
--
ALTER TABLE `tbl_hoadon`
  ADD PRIMARY KEY (`id_hoadon`),
  ADD KEY `id_khachhang` (`id_khachhang`),
  ADD KEY `id_khuyenmai` (`id_khuyenmai`),
  ADD KEY `id_nhanvien` (`id_nhanvien`);

--
-- Chỉ mục cho bảng `tbl_khachhang`
--
ALTER TABLE `tbl_khachhang`
  ADD PRIMARY KEY (`id_khachhang`);

--
-- Chỉ mục cho bảng `tbl_khuyenmai`
--
ALTER TABLE `tbl_khuyenmai`
  ADD PRIMARY KEY (`id_khuyenmai`);

--
-- Chỉ mục cho bảng `tbl_loaisanpham`
--
ALTER TABLE `tbl_loaisanpham`
  ADD PRIMARY KEY (`id_loaisanpham`);

--
-- Chỉ mục cho bảng `tbl_nhacungcap`
--
ALTER TABLE `tbl_nhacungcap`
  ADD PRIMARY KEY (`id_nhacungcap`);

--
-- Chỉ mục cho bảng `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  ADD PRIMARY KEY (`id_nhanvien`);

--
-- Chỉ mục cho bảng `tbl_phieunhaphang`
--
ALTER TABLE `tbl_phieunhaphang`
  ADD PRIMARY KEY (`id_phieunhaphang`),
  ADD KEY `id_nhanvien` (`id_nhanvien`),
  ADD KEY `id_nhacungcap` (`id_nhacungcap`);

--
-- Chỉ mục cho bảng `tbl_sanpham`
--
ALTER TABLE `tbl_sanpham`
  ADD PRIMARY KEY (`id_sanpham`),
  ADD KEY `id_loaisanpham` (`id_loaisanpham`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tbl_hoadon`
--
ALTER TABLE `tbl_hoadon`
  MODIFY `id_hoadon` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tbl_khachhang`
--
ALTER TABLE `tbl_khachhang`
  MODIFY `id_khachhang` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tbl_khuyenmai`
--
ALTER TABLE `tbl_khuyenmai`
  MODIFY `id_khuyenmai` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tbl_loaisanpham`
--
ALTER TABLE `tbl_loaisanpham`
  MODIFY `id_loaisanpham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=229;

--
-- AUTO_INCREMENT cho bảng `tbl_nhacungcap`
--
ALTER TABLE `tbl_nhacungcap`
  MODIFY `id_nhacungcap` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  MODIFY `id_nhanvien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4029;

--
-- AUTO_INCREMENT cho bảng `tbl_phieunhaphang`
--
ALTER TABLE `tbl_phieunhaphang`
  MODIFY `id_phieunhaphang` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tbl_sanpham`
--
ALTER TABLE `tbl_sanpham`
  MODIFY `id_sanpham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3152;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbl_chitiethoadon`
--
ALTER TABLE `tbl_chitiethoadon`
  ADD CONSTRAINT `tbl_chitiethoadon_ibfk_1` FOREIGN KEY (`id_hoadon`) REFERENCES `tbl_hoadon` (`id_hoadon`),
  ADD CONSTRAINT `tbl_chitiethoadon_ibfk_2` FOREIGN KEY (`id_sanpham`) REFERENCES `tbl_sanpham` (`id_sanpham`);

--
-- Các ràng buộc cho bảng `tbl_chitietkhuyenmai`
--
ALTER TABLE `tbl_chitietkhuyenmai`
  ADD CONSTRAINT `tbl_chitietkhuyenmai_ibfk_1` FOREIGN KEY (`id_khuyenmai`) REFERENCES `tbl_khuyenmai` (`id_khuyenmai`),
  ADD CONSTRAINT `tbl_chitietkhuyenmai_ibfk_2` FOREIGN KEY (`id_sanpham`) REFERENCES `tbl_sanpham` (`id_sanpham`);

--
-- Các ràng buộc cho bảng `tbl_chitietphieunhaphang`
--
ALTER TABLE `tbl_chitietphieunhaphang`
  ADD CONSTRAINT `tbl_chitietphieunhaphang_ibfk_1` FOREIGN KEY (`id_phieunhaphang`) REFERENCES `tbl_phieunhaphang` (`id_phieunhaphang`),
  ADD CONSTRAINT `tbl_chitietphieunhaphang_ibfk_2` FOREIGN KEY (`id_sanpham`) REFERENCES `tbl_sanpham` (`id_sanpham`);

--
-- Các ràng buộc cho bảng `tbl_dangnhap`
--
ALTER TABLE `tbl_dangnhap`
  ADD CONSTRAINT `tbl_dangnhap_ibfk_1` FOREIGN KEY (`id_nhanvien`) REFERENCES `tbl_nhanvien` (`id_nhanvien`);

--
-- Các ràng buộc cho bảng `tbl_hoadon`
--
ALTER TABLE `tbl_hoadon`
  ADD CONSTRAINT `tbl_hoadon_ibfk_1` FOREIGN KEY (`id_khachhang`) REFERENCES `tbl_khachhang` (`id_khachhang`),
  ADD CONSTRAINT `tbl_hoadon_ibfk_2` FOREIGN KEY (`id_khuyenmai`) REFERENCES `tbl_khuyenmai` (`id_khuyenmai`),
  ADD CONSTRAINT `tbl_hoadon_ibfk_3` FOREIGN KEY (`id_nhanvien`) REFERENCES `tbl_nhanvien` (`id_nhanvien`);

--
-- Các ràng buộc cho bảng `tbl_phieunhaphang`
--
ALTER TABLE `tbl_phieunhaphang`
  ADD CONSTRAINT `tbl_phieunhaphang_ibfk_1` FOREIGN KEY (`id_nhanvien`) REFERENCES `tbl_nhanvien` (`id_nhanvien`),
  ADD CONSTRAINT `tbl_phieunhaphang_ibfk_2` FOREIGN KEY (`id_nhacungcap`) REFERENCES `tbl_nhacungcap` (`id_nhacungcap`);

--
-- Các ràng buộc cho bảng `tbl_sanpham`
--
ALTER TABLE `tbl_sanpham`
  ADD CONSTRAINT `tbl_sanpham_ibfk_1` FOREIGN KEY (`id_loaisanpham`) REFERENCES `tbl_loaisanpham` (`id_loaisanpham`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
