export function hello(): string{
    return "Hello World";
}

export function helloWorld(): void {
    console.log(this.hello()+"!");
}
