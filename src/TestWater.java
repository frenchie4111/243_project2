import java.util.ArrayList;

public class TestWater extends Test {
	
		public void test_smoke() {
			assertTrue( true, "True is not true" );
		}
	
		public void test_01WaterStandard() {
			ArrayList<Integer> buckets = new ArrayList<Integer>();
			buckets.add(12);
			buckets.add(2);
			Puzzle water = new Water()
		}
		
		public void test_02ClockPast0() {
			Puzzle clock = new Clock(12, 1, 11);
			
			ArrayList< Puzzle > results = Solver.solve(clock);
			
			assertEqual( results.get(0).getConfig(), 1, "First result is wrong" );
			assertEqual( results.get(1).getConfig(), 12, "Second result is wrong" );
			assertEqual( results.get(2).getConfig(), 11, "Third results is wrong" );
		}
	
		public static void main( String[] args ) {
			Test tester = new TestWater();
			tester.run();
		}
}
