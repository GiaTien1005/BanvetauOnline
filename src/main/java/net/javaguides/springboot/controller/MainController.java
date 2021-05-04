package net.javaguides.springboot.controller;

import net.javaguides.springboot.dto.TimKiemRequestDTO;
import net.javaguides.springboot.model.GaTau;
import net.javaguides.springboot.model.KhachHang;
import net.javaguides.springboot.repository.GaTauRepository;
import net.javaguides.springboot.repository.KhachHangRepository;
import net.javaguides.springboot.service.BanVeTauOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private BanVeTauOnlineService banVeTauOnlineService;

    @Autowired
    private KhachHangRepository khachHangRepository;


    // http://localhost:8080/tim-kiem
    @GetMapping("/tim-kiem")
    public String getGaTau(Model model) {
        TimKiemRequestDTO dto = new TimKiemRequestDTO();

        // Lấy danh sách ga tàu từ DB
        List<GaTau> gaTaus = banVeTauOnlineService.getGaTau();
        model.addAttribute("gaTaus", gaTaus);
        model.addAttribute("dto",dto);
        return "trang_tim_kiem";
    }

    // http://localhost:8080/tim-kiem
    @GetMapping("/ket-qua-tim-kiem")
    public String timKiem(@ModelAttribute("dto") TimKiemRequestDTO dto, Model model){
        System.out.println(dto.toString());
        model.addAttribute("dto",dto);
        return "ket_qua_tim_kiem";
    }

    String maKhachHang = "KH" + String.valueOf((int)(Math.random() * 50 + 1));
    // http://localhost:8080/nhap-thong-tin
    @GetMapping("/nhap-thong-tin")
    public String thanhToan(Model model){
        // Em test nên sẽ random nhẫu nhiên mã khách hàng

        KhachHang khachHang = new KhachHang();
        khachHang.setMaKhachHang(maKhachHang);
        model.addAttribute("khachHang", khachHang);
        return "nhap_thong_tin";
    }

    @PostMapping("/luu-thong-tin")
	public String saveEmployee(@ModelAttribute("khachHang") KhachHang khachHang) {
		// lưu dữ liệu xuống database
        khachHang.setMaKhachHang(maKhachHang);
        System.out.println(khachHang.toString());
		khachHangRepository.save(khachHang);
		return "ket_qua_luu_thong_tin";
	}
}
