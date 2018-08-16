package shu.shu;

import org.ansj.domain.Result;
import org.ansj.splitWord.analysis.ToAnalysis;

public class Split {
	
	public static void main(String[] args) {
		Result result = ToAnalysis.parse("我爱中国");
		System.out.println(result);
	}
}
