package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.*;
import net.javaguides.springboot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/create-data-first")
public class CreateDataFirst {

    //localhost:8080/create-data-first/all

    @Autowired
    private GaTauRepository gaTauRepository;
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Autowired
    private TauRepository tauRepository;
    @Autowired
    private ToaTauRepository toaTauRepository;
    @Autowired
    private ChoNgoiRepository choNgoiRepository;
    @Autowired
    private VeTauRepository veTauRepository;

    @GetMapping("/all")
    public String create(){
        try {
            //todo: Tạo danh sách ga tàu
            List<GaTau> gaTaus = new ArrayList<>();
            gaTaus.add(new GaTau("SÀI GÒN"));
            gaTaus.add(new GaTau("HÀ NỘI"));
            gaTaus.add(new GaTau("HẢI PHÒNG"));
            gaTaus.add(new GaTau("HUẾ"));
            gaTaus.add(new GaTau("ĐÀ NẲNG"));
            gaTauRepository.saveAll(gaTaus);

            //todo: Tạo danh sách khách hàng
            List<KhachHang> khachHangs = new ArrayList<>();
            khachHangs.add(new KhachHang(
                    "KH01",
                    "NGƯỜI LỚN",
                    "KHÁCH HÀNG 1",
                    "000000001",
                    "KH01@gmail.com",
                    "0946111111"));
            khachHangs.add(new KhachHang(
                    "KH02",
                    "NGƯỜI LỚN",
                    "KHÁCH HÀNG 2",
                    "000000002",
                    "KH02@gmail.com",
                    "0946111112"));
            khachHangs.add(new KhachHang(
                    "KH03",
                    "NGƯỜI LỚN",
                    "KHÁCH HÀNG 3",
                    "000000003",
                    "KH03@gmail.com",
                    "0946111113"));
            khachHangs.add(new KhachHang(
                    "KH04",
                    "NGƯỜI LỚN",
                    "KHÁCH HÀNG 4",
                    "000000004",
                    "KH04@gmail.com",
                    "0946111114"));
            khachHangs.add(new KhachHang(
                    "KH05",
                    "NGƯỜI LỚN",
                    "KHÁCH HÀNG 5",
                    "000000005",
                    "KH05@gmail.com",
                    "0946111115"));
            khachHangRepository.saveAll(khachHangs);

            //todo: Tạo danh sách chuyến tàu
            List<Tau> taus = new ArrayList<>();
            taus.add(new Tau(
                    "T01",
                    Date.valueOf("2021-04-30"),
                    500,
                    gaTauRepository.findById(1L).get(),
                    gaTauRepository.findById(5L).get()));
            taus.add(new Tau(
                    "T02",
                    Date.valueOf("2021-05-05"),
                    1000,
                    gaTauRepository.findById(1L).get(),
                    gaTauRepository.findById(2L).get()));
            taus.add(new Tau(
                    "T03",
                    Date.valueOf("2021-05-04"),
                    800,
                    gaTauRepository.findById(1L).get(),
                    gaTauRepository.findById(4L).get()));
            taus.add(new Tau(
                    "T04",
                    Date.valueOf("2021-04-30"),
                    100,
                    gaTauRepository.findById(1L).get(),
                    gaTauRepository.findById(3L).get()));
            taus.add(new Tau(
                    "T05",
                    Date.valueOf("2021-04-30"),
                    500,
                    gaTauRepository.findById(1L).get(),
                    gaTauRepository.findById(5L).get()));
            tauRepository.saveAll(taus);

            //todo: Tạo danh sách toa tàu
            List<ToaTau> toaTaus = new ArrayList<>();
            toaTaus.add(new ToaTau("TT01",tauRepository.findById("T01").get()));
            toaTaus.add(new ToaTau("TT02",tauRepository.findById("T01").get()));
            toaTaus.add(new ToaTau("TT03",tauRepository.findById("T01").get()));
            toaTaus.add(new ToaTau("TT04",tauRepository.findById("T03").get()));
            toaTaus.add(new ToaTau("TT05",tauRepository.findById("T03").get()));
            toaTaus.add(new ToaTau("TT06",tauRepository.findById("T03").get()));
            toaTaus.add(new ToaTau("TT07",tauRepository.findById("T02").get()));
            toaTaus.add(new ToaTau("TT08",tauRepository.findById("T02").get()));
            toaTaus.add(new ToaTau("TT09",tauRepository.findById("T02").get()));
            toaTaus.add(new ToaTau("TT10",tauRepository.findById("T02").get()));
            toaTauRepository.saveAll(toaTaus);

            //todo: Tạo danh sách chỗ ngồi
            List<ChoNgoi> choNgois = new ArrayList<>();
            choNgois.add(new ChoNgoi(
                    "A01",
                    "GHẾ MỀM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT01").get()));
            choNgois.add(new ChoNgoi(
                    "A02",
                    "GHẾ MỀM ĐIỀU HÒA",
                    "ĐÃ ĐẶT",
                    toaTauRepository.findById("TT01").get()));
            choNgois.add(new ChoNgoi(
                    "A03",
                    "GHẾ MỀM ĐIỀU HÒA",
                    "ĐÃ ĐẶT",
                    toaTauRepository.findById("TT01").get()));
            choNgois.add(new ChoNgoi(
                    "A04",
                    "GHẾ MỀM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT01").get()));
            choNgois.add(new ChoNgoi(
                    "A05",
                    "GHẾ MỀM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT01").get()));
            choNgois.add(new ChoNgoi(
                    "B01",
                    "GHẾ CỨNG ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT03").get()));
            choNgois.add(new ChoNgoi(
                    "B02",
                    "GHẾ CỨNG ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT03").get()));
            choNgois.add(new ChoNgoi(
                    "B03",
                    "GHẾ CỨNG ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT03").get()));
            choNgois.add(new ChoNgoi(
                    "B04",
                    "GHẾ CỨNG ĐIỀU HÒA",
                    "ĐÃ ĐẶT",
                    toaTauRepository.findById("TT03").get()));
            choNgois.add(new ChoNgoi(
                    "B05",
                    "GHẾ CỨNG ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT03").get()));
            choNgois.add(new ChoNgoi(
                    "A01",
                    "GIƯỜNG NẰM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT04").get()));
            choNgois.add(new ChoNgoi(
                    "A02",
                    "GIƯỜNG NẰM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT04").get()));
            choNgois.add(new ChoNgoi(
                    "A03",
                    "GIƯỜNG NẰM ĐIỀU HÒA",
                    "ĐÃ ĐẶT",
                    toaTauRepository.findById("TT04").get()));
            choNgois.add(new ChoNgoi(
                    "A04",
                    "GIƯỜNG NẰM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT04").get()));
            choNgois.add(new ChoNgoi(
                    "A05",
                    "GIƯỜNG NẰM ĐIỀU HÒA",
                    "CÒN TRỐNG",
                    toaTauRepository.findById("TT04").get()));

            choNgoiRepository.saveAll(choNgois);

            //todo: danh sách vé tàu của khách hàng
            List<VeTau> veTaus = new ArrayList<>();
            veTaus.add(new VeTau(
                    "VT01",
                    "VÉ THƯỜNG",
                    khachHangRepository.findById("KH01").get(),
                    tauRepository.findById("T01").get()));
            veTaus.add(new VeTau(
                    "VT02",
                    "VÉ THƯỜNG",
                    khachHangRepository.findById("KH02").get(),
                    tauRepository.findById("T01").get()));
            veTaus.add(new VeTau(
                    "VT03",
                    "VÉ THƯỜNG",
                    khachHangRepository.findById("KH03").get(),
                    tauRepository.findById("T01").get()));
            veTaus.add(new VeTau(
                    "VT04",
                    "VÉ THƯỜNG",
                    khachHangRepository.findById("KH04").get(),
                    tauRepository.findById("T01").get()));
            veTaus.add(new VeTau(
                    "VT05",
                    "VÉ THƯỜNG",
                    khachHangRepository.findById("KH05").get(),
                    tauRepository.findById("T01").get()));

            veTauRepository.saveAll(veTaus);
            return "OK";
        }catch (Exception e){
            System.out.println(e);
            return "ERROR";
        }
    }

}
