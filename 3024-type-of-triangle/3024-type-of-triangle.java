class Solution {
    public String triangleType(int[] nums) {
        String triangle = "";
        boolean isTriangle = false;

        if ((nums[0] + nums[2]) > nums[1] && (nums[0] + nums[1]) > nums[2] && (nums[1] + nums[2]) > nums[0]) {
            isTriangle = true;

            if (nums[0] == nums[1]) {
                if (nums[0] == nums[2]) {
                    triangle = "equilateral";
                } else {
                    triangle = "isosceles";
                }
            } else if (nums[1] == nums[2]) {
                if (nums[0] == nums[2]) {
                    triangle = "equilateral";
                } else {
                    triangle = "isosceles";
                }
            } else if (nums[0] == nums[2]) {
                if (nums[0] == nums[1]) {
                    triangle = "equilateral";
                } else {
                    triangle = "isosceles";
                }
            } else {
                triangle = "scalene";
            }
        }

        if (isTriangle) {
            return triangle;
        }

        return "none";
    }
}