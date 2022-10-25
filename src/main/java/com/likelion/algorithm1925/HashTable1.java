package com.likelion.algorithm1925;

public class HashTable1 {

    private int size = 10000;
    int[] valueArray= new int[size];

    public HashTable1(){

    }

    public HashTable1(int size){
        this.size = size;
    }


    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }

        return asciiSum%size;
    }

    public void insert(String key, int value){
        valueArray[hash(key)] = value;
        System.out.printf("%s가 %d 번 방에 저장되었습니다\n",key, value);
    }

    public int search(String key){
        return valueArray[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang", "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu",
                "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim",
                "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim",
                "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark",
                "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok",
                "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn",
                "SoonminEom", "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee",
                "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang",
                "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho",
                "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan",
                "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};

        HashTable1 hashTable1 = new HashTable1(names.length);
        for (String name: names) {
            hashTable1.insert(name, hashTable1.hash(name));
        }

        // 해쉬가 충돌하는 상태
        System.out.println(hashTable1.search("SeunghwanJeon"));
        System.out.println(hashTable1.search("DaehwanJung"));


    }
}
