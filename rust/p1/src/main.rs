extern crate rand;

use std::io;
use rand::Rng;
use std::str;

fn main() {
    let mut name = String::new(); 
    
    let secret_num = rand::thread_rng().gen_range(1, 201);

    println!("PLOSE TELL ME NAME");
    io::stdin().read_line(&mut name)
        .expect("Failed to read line");
    print!("{}", name);
    println!(" are you so ritar?");
    
    loop {
        let mut guess = String::new();
    
        println!("PLOSE TELL ME NUM");
        io::stdin().read_line(&mut guess)
           .expect("Failed to read line");

        println!("You did guess of a num: {}", guess);
        //println!("Real num is: {}", secret_num);
        
        let guess_int: i32 = guess.trim().parse::<i32>().unwrap();
        if guess_int < secret_num {
            println!("You am too low");
        }
        else if guess_int > secret_num {
            println!("You stayed too high all the time");
        }
        else {
            println!("You did a good");
            break;
        }
        
    }
}

