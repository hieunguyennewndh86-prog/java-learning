import module java.base;
import module java.base;
void jar(String... args) { run("jar", args); }
void javac(String... args) { run("javac", args); }
void javadoc(String... args) { run("javadoc", args); }
void javap(String... args) { run("javap", args); }
void jdeps(String... args) { run("jdeps", args); }
void jlink(String... args) { run("jlink", args); }
void jmod(String... args) { run("jmod", args); }
void jpackage(String... args) { run("jpackage", args); }
void javap(Class<?> type) throws Exception {
    if (type.isPrimitive() || type.isHidden() || type.isArray()) throw new IllegalArgumentException("Type has no class file: " + type);
    try {
        var name = type.getName();
        if (type == Class.forName(name, false, ClassLoader.getSystemClassLoader())) {
            run("javap", "-c", "-v", "-s", name);
            return;
        }
    } catch (ClassNotFoundException ignored) {
        // fall-through
    }
    var temp = java.nio.file.Files.createTempFile("TOOLING-", ".class");
    try {
        var name = type.getName().replace('.', '/') + ".class";
        try (var in = type.getClassLoader().getResourceAsStream(name);
             var out = java.nio.file.Files.newOutputStream(temp)) {
            if (in == null) throw new AssertionError("Resource not found: " + name);
            in.transferTo(out);
        }
        run("javap", "-c", "-v", "-s", temp.toString());
    } finally {
        java.nio.file.Files.delete(temp);
    }
}
void run(String name, String... args) {
    var tool = java.util.spi.ToolProvider.findFirst(name);
    if (tool.isEmpty()) throw new RuntimeException("No such tool found: " + name);
    var code = tool.get().run(System.out, System.err, args);
    if (code == 0) return;
    System.err.println(name + " returned non-zero exit code: " + code);
}
void tools() {
  java.util.ServiceLoader.load(java.util.spi.ToolProvider.class).stream()
      .map(java.util.ServiceLoader.Provider::get)
      .map(java.util.spi.ToolProvider::name)
      .sorted()
      .forEach(System.out::println);
}
void print(boolean b) { System.out.print(b); }
void print(char c) { System.out.print(c); }
void print(int i) { System.out.print(i); }
void print(long l) { System.out.print(l); }
void print(float f) { System.out.print(f); }
void print(double d) { System.out.print(d); }
void print(char s[]) { System.out.print(s); }
void print(String s) { System.out.print(s); }
void print(Object obj) { System.out.print(obj); }
void println() { System.out.println(); }
void println(boolean b) { System.out.println(b); }
void println(char c) { System.out.println(c); }
void println(int i) { System.out.println(i); }
void println(long l) { System.out.println(l); }
void println(float f) { System.out.println(f); }
void println(double d) { System.out.println(d); }
void println(char s[]) { System.out.println(s); }
void println(String s) { System.out.println(s); }
void println(Object obj) { System.out.println(obj); }
void printf(java.util.Locale l, String format, Object... args) { System.out.printf(l, format, args); }
void printf(String format, Object... args) { System.out.printf(format, args); }