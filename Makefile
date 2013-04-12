build: src/Water.java src/Puzzle.java src/Clock.java src/Solver.java
	javac -d bin -sourcepath src/ src/Water.java

build-test: src/TestWater.java
	javac -d bin -sourcepath src/ src/TestWater.java

test: 
	make build
	make build-test
	java -cp bin/ TestWater

try: 
	try grd-243 project2-1 src/Clock.java src/Water.java src/Puzzle.java src/Solver.java src/design.txt
