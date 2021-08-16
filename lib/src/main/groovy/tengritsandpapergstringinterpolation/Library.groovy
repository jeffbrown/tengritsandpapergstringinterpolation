package tengritsandpapergstringinterpolation

class Library {
    String processByInterface(PublicBinary obj) {
        return "Public Key Is [${obj.publicKey}]"
    }

    String processByConcreteType(AdditionalPublicBinary obj) {
        return "Public Key Is [${obj.publicKey}]"
    }
}
