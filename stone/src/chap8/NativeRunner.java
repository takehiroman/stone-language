package chap8;
import javassist.gluonj.util.Loader;
import chap7.ClosureEvaluator;

public class NativeRunner {

	public static void main(String[] args) throws Throwable{
		// TODO 自動生成されたメソッド・スタブ
		Loader.run(NativeInterpreter.class, args, NativeEvaluator.class,ClosureEvaluator.class);

	}

}
