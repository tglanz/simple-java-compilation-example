buildPath=./build/java/main
srcPath=./src/java/main

javaFiles=$(find ./src/java/main -type f -name "*.java")

echo ""
echo "Java Files:"
echo "$javaFiles"

echo ""
echo "Building $srcPath into $buildPath"
mkdir -p $buildPath
javac -d $buildPath -sourcepath $srcPath $javaFiles