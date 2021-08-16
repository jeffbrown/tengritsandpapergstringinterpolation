package tengritsandpapergstringinterpolation

import spock.lang.Specification

class LibraryTest extends Specification {
    def "someLibraryMethod returns true"() {
        setup:
        def lib = new Library()
        def binary = new AdditionalPublicBinary(publicKey: 'My Key Value')

        expect:
        lib.processByConcreteType(binary) == 'Public Key Is [My Key Value]'
        lib.processByInterface(binary) == 'Public Key Is [My Key Value]'
    }
}
