package com.automation.boilerplate;//package com.juaracoding.ta_kelompok2;
//
//import com.juaracoding.ta_kelompok2.util.ManipulateImage;
//import com.juaracoding.ta_kelompok2.util.OpenCVFunction;
//
//
//public class Main {
//
//    public static void main(String[] args) {
//
////        SociolaRotateImage sociolaRotateImage = new SociolaRotateImage();
////        sociolaRotateImage.eksekusi();
//
////        /** example compare image */
////        String filename1 = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\imagegambar-awal.png";
////        String filename2 = "D:\\download-automation\\gambar-180-abu-abu.png";
////        System.out.println(ManipulateImage.compareImage(filename1,filename2));
//
////        /** example compare with high Level difference (in case original with compressed image) image */
////        String filename1 = System.getProperty("user.dir")+"/data/\\Ori-1.jpg";
////        String filename2 = System.getProperty("user.dir")+"/data/\\Ori-1-Compress.jpg";
//////        String filename2 = "D:/\\download-automation\\29092024050544696_faskes-awal-1-DL.jpg";
////        /** kalau gambar yang akan dicompare itu adalah compressan, parameter ke 2 diisi dengan angka 16, kalau tidak, isi saja  1 */
////        System.out.println(ImageComparassion.calculateDifferences(filename1,16,filename2,1));
//
////        /** contoh untuk membuat gambar menjadi abu-abu */
////        String filename1 = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar-awal.png";
////        String pathTujuan = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar-180-abu-abu.png";
////        ManipulateImage.grayScale(filename1,pathTujuan);
//
////        /** contoh untuk membuat gambar menjadi sepia */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-180.png";
////        String pathTujuan = "D:\\download-automation\\gambar-180-sepia.png";
////        ManipulateImage.sepia(filename1,pathTujuan);
//
////        /** contoh untuk membuat gambar menjadi mirroring */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-180.png";
////        String pathTujuan = "D:\\download-automation\\gambar-180-mirror.png";
////        ManipulateImage.mirroring(filename1,pathTujuan);
//
////        /** contoh untuk membuat gambar menjadi negatif */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-180.png";
////        String pathTujuan = "D:\\download-automation\\gambar-180-negative.png";
////        ManipulateImage.negative(filename1,pathTujuan);
//
//
////        /** contoh untuk mengubah orientasi gambar */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-180.png";
////        String pathTujuan = "D:\\download-automation\\gambar-180-beda-orientasi.png";
////        OpenCVFunction.changeOrientation(filename1,pathTujuan);
//
////        /** contoh untuk mengkompress gambar */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-180.png";
////        String pathTujuan = "D:\\download-automation\\gambar-180-beda-compressed.png";
////        OpenCVFunction.compressImage(filename1,pathTujuan);
//
////        /** contoh untuk mengacak pixeL */
////        String filename1 = "D:\\download-automation\\gambar-180-random.png";
////        ManipulateImage.randomPixel(filename1);
//
////        /** contoh untuk membuat gambar menjadi watermark */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-180.png";
////        String pathTujuan = "D:\\download-automation\\gambar-180-watermark.png";
////        ManipulateImage.watermarking(filename1,pathTujuan,"INI TESTING !!");
//
//        /** contoh untuk membuat gambar berotasi */
////        String filename1 = System.getProperty("user.dir")+"\\data\\gambar-awal.png";
//        String filename1 = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_original.png";
//        String pathTujuan = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar-90-rotate-90-fix.png";
//        OpenCVFunction.rotateImage(filename1,pathTujuan,-90);
//    }
//}