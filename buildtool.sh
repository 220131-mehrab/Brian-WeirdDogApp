DESTINATION=/c/Users/brian/bin/Brian-nycdogs

install(){
	echo "Installing to $DESTINATION..."
	cp Brian-nycdogs $DESTINATION
}

uninstall() { 
	echo "Uninstalling from $DESTINATION..."
	rm $DESTINATION
}

build(){
	echo "Compiling Java program to ./bin"
	javac -d bin src/nycdogs.java
}

run(){
	echo "Running..."
	java -cp bin Brian-nycdogs nycdogs.csv
}

"$@"
