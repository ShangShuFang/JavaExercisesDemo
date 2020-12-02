package com.shangshufang.homework.step1.knowledge9001_12;
/**
 * Java条件语句-if...else
 */
public class Demo2 {
    public static void main(String[] args) {
        final int firstBatchesScore = 451;
        final int secondBatchesScore = 350;

        float score = 420F;

        if (score >= firstBatchesScore) {
            System.out.println("恭喜您，您以达到陕西2020年理工类一本录取分数线");
        } else if (score >= secondBatchesScore) {
            System.out.println("恭喜您，您以达到陕西2020年理工类二本录取分数线");
        } else {
            System.out.println("对不起，您未达到陕西2020年理工类本科录取分数线");
        }
    }
}