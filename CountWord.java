public class CountWord {
    public static void main(String[] args) {
        String words = "For roboticists, one challenge towers above all others: generalization — the ability to create machines that can adapt to any environment or condition. Since the 1970s, the field has evolved from writing sophisticated programs to using deep learning, teaching robots to learn directly from human behavior. But a critical bottleneck remains: data quality. To improve, robots need to encounter scenarios that push the boundaries of their capabilities, operating at the edge of their mastery. This process traditionally requires human oversight, with operators carefully challenging robots to expand their abilities. As robots become more sophisticated, this hands-on approach hits a scaling problem: the demand for high-quality training data far outpaces humans’ ability to provide it.";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
