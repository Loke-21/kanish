package kanish

class Person {
    String firstName
    String lastName
    int age

    static constraints = {
        firstName matches: "[a-zA-Z]+",minSize:2,maxSize: 4

    }
    static mapping=
    {

    }
}
