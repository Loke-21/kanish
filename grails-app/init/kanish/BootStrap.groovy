package kanish

class BootStrap {

    def init = { servletContext ->
    
    new Person(firstName:'Kalyani',lastName:'Venkatesan',age:40).save()
    new Person(firstName:'Venkatesan',lastName:'Ramasamy',age:50).save()



    }
    def destroy = {
    }
}
