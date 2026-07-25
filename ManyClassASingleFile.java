class ManyClassASingleFile {
  void main(String[] args) {
    IO.println(Class1.generateMsg());
    IO.println(Class2.generateOtherMsg());
  }
}

class Class1 {
  static String generateMsg() {
    return "A message was generated";
  }
}

class Class2 {
  static String generateOtherMsg() {
    return "An other msg was generated";
  }
}