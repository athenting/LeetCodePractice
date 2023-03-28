package Solutions;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
class ReplaceString {
    public String replaceSpace(String s) {

        s.replace(" ", "%20");

        return s;

    }
}