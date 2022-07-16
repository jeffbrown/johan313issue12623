package johan313issue12623

class DemoController {

    def index() {
        respond new Widget(), formats: ['json']
    }
}

class Widget {
    String name = 'me'
}