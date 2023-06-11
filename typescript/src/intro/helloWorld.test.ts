import { hello } from "./helloWorld"


describe('testing helloWorld file', () => {
    test('returned string shoud equal "Hello World"', () => {
        expect(hello()).toBe("Hello World")
    })
})
