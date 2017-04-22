fn main() {
    use std::process::Command;

    Command::new("ls")
        .spawn()
        .expect("command failed");
    
    println!("Hello, world!");
        
    println!("{}", 10);
}
