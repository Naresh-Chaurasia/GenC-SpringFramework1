package com.concepts1;

public class SortingAlgorithm {
    ISort sort;

    SortingAlgorithm(ISort sort){
        this.sort = sort;
    }

    public void performSort(int a[]){
        sort.sort(a);
    }
}
