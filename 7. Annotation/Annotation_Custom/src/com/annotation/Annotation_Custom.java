package com.annotation;

@interface maker_annotation{}

@interface single_annotation{
    int nilai();
}

@interface multi_annotation{
    int nomer();
    String nama_Depan();
    String nama_belakang();
}

public class Annotation_Custom {
    public static void main(String[] args) {
        @maker_annotation
        @single_annotation(nilai = 10)
        @multi_annotation(nomer = 1, nama_Depan = "Membuat", nama_belakang = "Annotasi")
    }
}
