class Solution {
    public String convertToTitle(int columnNumber) {
        int temp = columnNumber;
        StringBuilder sb = new StringBuilder();
        char[] arr = {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
        String str = "ZABCDEFGHIJKLMNOPQRSTUVWXY";
        System.out.println("temp : " + temp);
        while(temp > 0){
            int rem = temp%26;
            System.out.println("Rem : " + rem);
            //System.out.println(arr[rem]);
            System.out.println(str.charAt(rem));
            sb = sb.append(str.charAt(rem));
            if(rem==0){
                temp--;
            }
            temp = temp/26;
            System.out.println("temp : " + temp);
        }
        return sb.reverse().toString();
    }
}