package com.fju.ai;
/*
    郵局有三種郵便箱，名稱為 一號箱、二號箱與三號箱，其大小分別為(長寬高)：
    一號箱：10/10/10
    二號箱：20/20/20
    三號箱：30/30/30
    以下程式為一個讓使用者輸入欲寄送物品的長寬高，幫他選擇合適的郵便箱程式。
    請在「不修改 BoxTester 與 Box 類別」的前提下，完成必要的類別設計，使其能正常執行如下：
    Please enter object's length: 8
    Please enter object's width: 8
    Please enter object's height: 8
    一號箱

    Please enter object's length: 12
    Please enter object's width: 8
    Please enter object's height: 10
    二號箱

    Please enter object's length: 13
    Please enter object's width: 10
    Please enter object's height: 21
    三號箱
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box1());
        boxes.add(new Box2());
        boxes.add(new Box3());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object's width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object's height: ");
        int height = Integer.parseInt(scanner.next());
        for (Box box : boxes) {
            if (box.isFit(length, width, height)) {
                System.out.println(box);
                break;
            }
        }
    }
}
