package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int numberOfBucketsNeeded = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            double totalArea = width * height;
            numberOfBucketsNeeded = (int) Math.ceil((totalArea - extraBuckets * areaPerBucket) / areaPerBucket);
            return numberOfBucketsNeeded;
        }
        return numberOfBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int numberOfBucketsNeeded = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0) {
            double totalArea = width * height;
            numberOfBucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);
            return numberOfBucketsNeeded;
        }
        return numberOfBucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        int numberOfBucketsNeeded = -1;
        if (area > 0 && areaPerBucket > 0) {
            numberOfBucketsNeeded = (int) Math.ceil(area / areaPerBucket);
            return numberOfBucketsNeeded;
        }
        return numberOfBucketsNeeded;
    }


}
