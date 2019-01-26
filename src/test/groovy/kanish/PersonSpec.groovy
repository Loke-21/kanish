package kanish

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def setup() {
    }

    def cleanup() {
    }
    void 'test name cannot be blank'() {
    when:
    domain.firstName = ''

    then:
    !domain.validate(['firstName'])
}

 void 'test name can have a maximum of 255 characters'() {
    when: 'for a string of 256 characters'
    domain.firstName = "Harish"

    then: 'firstName validation fails'
    !domain.validate(['firstName'])
    domain.errors['firstName'].code == 'maxSize.exceeded'
}
}
