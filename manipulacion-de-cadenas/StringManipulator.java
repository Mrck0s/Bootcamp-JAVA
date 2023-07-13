public class StringManipulator{
    public String join(String str1, String str2) {
        String trimStr1 = str1.trim();
        String trimStr2 = str2.trim();
        return trimStr1.concat(trimStr2);
    }
    public int getIndexOrNull(String str, char c) {
        int index = str.indexOf(c);
        return index;
    }
    public int getIndexOrNullSub(String str, String subStr) {
        int index = str.indexOf(subStr);
        return index;
    }
    public String joinSub(String str, int startIndex, int endIndex, String concatStr) {
        String subStr = str.substring(startIndex, endIndex);
        return subStr.concat(concatStr);
    }
}