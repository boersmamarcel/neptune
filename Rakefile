
namespace :build do
	file "antlr/Neptune.java" => "antlr/Neptune.g" do
		sh "java org.antlr.Tool antlr/Neptune.g"
	end

	file "antlr/NeptuneChecker.java" => "antlr/NeptuneChecker.g" do
		sh "java org.antlr.Tool antlr/NeptuneChecker.g"
	end

	file "antlr/NeptuneGenerator.java" => "antlr/NeptuneGenerator.g" do
		sh "java org.antlr.Tool antlr/NeptuneGenerator.g"
	end

	desc "Build generator"
	task :generator => [:setup, "antlr/NeptuneGenerator.java"] do
		puts "building generator"
	end

	desc "Build checker"
	task :checker => [:setup, "antlr/NeptuneChecker.java"] do
		puts "building checker"
	end

	desc "Build parser"
	task :parser => [:setup, "antlr/Neptune.java"] do
		puts "Building parser"
	end

	task :setup do
		dir_name = File.dirname(__FILE__)
		puts "Setup CLASSPATH"
		ENV['CLASSPATH'] = "#{dir_name}/neptune/antlr-3.5.2-complete.jar"
	end

	desc "Build language"
	task :all => [:setup, :parser,  :checker, :generator]do
		puts "Done building your language files with antlr"
	end

end

namespace :copy do
	desc "copy parser"
	task :parser do
		sh "cp -f antlr/NeptuneLexer.java antlr/NeptuneParser.java Neptune.tokens neptune/src/neptune/"
	end

	desc "copy checker"
	task :checker do
		sh "cp -f antlr/NeptuneChecker.java NeptuneChecker.tokens neptune/src/neptune/"
	end

	desc "copy generator"
	task :generator do
		sh "cp -f antlr/NeptuneGenerator.java NeptuneGenerator.tokens neptune/src/neptune/"
	end

	desc "copy all"
	task :all => [:parser, :checker, :generator] do

	end
end


task :default do
 puts "Build your compiler for the Neptune language"
 puts "Start with rake build:all or try rake -T"
end