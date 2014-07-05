
namespace :build do
	file "tmp/Neptune.java" => "antlr/Neptune.g" do
		sh "java org.antlr.Tool antlr/Neptune.g -o tmp/"
	end

	file "tmp/NeptuneTree.java" => ["antlr/NeptuneTree.g", "antlr/Neptune.g"] do
		sh "java org.antlr.Tool antlr/NeptuneTree.g -o tmp/"
	end

	desc "Build tree"
	task :tree => [:setup, "tmp/NeptuneTree.java"] do
		puts "building tree"
	end

	desc "Build parser"
	task :parser => [:setup, "tmp/Neptune.java"] do
		puts "Building parser"
	end

	task :setup do
		dir_name = File.dirname(__FILE__)
		puts "Setup CLASSPATH"
		ENV['CLASSPATH'] = "#{dir_name}/neptune/antlr-3.5.2-complete.jar"
	end

	desc "Build language"
	task :all => [:setup, :parser, :tree]do
		puts "Done building your language files with antlr"
	end

end

namespace :copy do
	desc "copy parser"
	task :parser do
		sh "cp -f tmp/antlr/NeptuneLexer.java tmp/antlr/NeptuneParser.java tmp/Neptune.tokens neptune/src/neptune/"
	end

	desc "copy tree"
	task :tree do
		sh "cp -f tmp/antlr/NeptuneTree.java tmp/NeptuneTree.tokens neptune/src/neptune/"
	end

	desc "copy all"
	task :all => [:parser, :tree] do

	end
end



namespace :run do
	desc "Run test"
	task :test do
		sh "java -classpath neptune/bin:neptune/antlr-3.5.2-complete.jar test.TestNeptune"
	end
	desc "Run compiler"
	task :compiler, [:ast, :dot, :file] do |t, args|
		add_args = ""
		
		add_args = add_args + "-ast" if args[:ast] == "ast"
		add_args = add_args + " -dot " if args[:dot] == "dot"
		add_args = add_args + args[:file]

		sh "java -classpath neptune/bin:neptune/antlr-3.5.2-complete.jar neptune.Neptune #{add_args}"
	end

	desc "Assembly"
	task :assembly, [:file] do |t, args|
		dir_name = File.dirname(__FILE__)
		ENV['CLASSPATH'] = "#{ENV['CLASSPATH']}:#{dir_name}/TAM/Assembler.jar:#{dir_name}/TAM/Triangle.jar"
		sh "java TAM.Assembler #{args[:file]} tam.obj; java TAM.Interpreter tam.obj"
	end
end


task :default do
 puts "Build your compiler for the Neptune language"
 puts "Start with rake build:all or try rake -T"
end

task :all => ["build:all", "copy:all"] do
  puts "Doing all things related to building and copying. Lorem Ipsum."
end