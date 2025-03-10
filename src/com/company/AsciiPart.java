package com.company;

public class AsciiPart {

    // ASCII-арт заголовка игры
    public static final String GAME_TITLE = """
         _    _                                          
        | |  | |                                         
        | |__| | __ _ _ __   __ _ _ __ ___   __ _ _ __  
        |  __  |/ _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ 
        | |  | | (_| | | | | (_| | | | | | | (_| | | | |
        |_|  |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|
                             __/ |                      
                            |___/                       
        """;

    // Пустая виселица (начало игры) - теперь развёрнута в другую сторону
    public static final String EMPTY_GALLOW = """
        +---+
        |   |
        |    
        |    
        |    
        |    
        =========
        """;

    // Добавлена голова
    public static final String HEAD = """
        +---+
        |   |
        |   O
        |    
        |    
        |    
        =========
        """;

    // Голова + тело
    public static final String BODY = """
        +---+
        |   |
        |   O
        |   |
        |    
        |    
        =========
        """;

    // Голова + тело + одна рука
    public static final String ONE_ARM = """
        +---+
        |   |
        |   O
        |  /|
        |    
        |    
        =========
        """;

    // Голова + тело + обе руки
    public static final String TWO_ARMS = """
        +---+
        |   |
        |   O
        |  /|\\
        |    
        |    
        =========
        """;

    // Голова + тело + обе руки + одна нога
    public static final String ONE_LEG = """
        +---+
        |   |
        |   O
        |  /|\\
        |  / 
        |    
        =========
        """;

    // Полная виселица (проигрыш)
    public static final String FULL_HANGMAN = """
        +---+
        |   |
        |   O
        |  /|\\
        |  / \\
        |    
        =========
        """;

    // Сообщение о начале игры
    public static final String GAME_START = """
        Добро пожаловать в игру Виселица!
        Угадайте слово, вводя по одной букве.
        У вас есть 6 попыток. Удачи!
        """;

    // Сообщение о проигрыше
    public static final String GAME_OVER = """
        Игра окончена! Вы проиграли.
        """;

    // Сообщение о победе
    public static final String GAME_WIN = """
        Поздравляем! Вы угадали слово!
        """;

    // Сообщение о повторной игре
    public static final String PLAY_AGAIN = """
        Хотите сыграть снова? (да/нет)
        """;

    // Сообщение перед вводом буквы
    public static final String INPUT_PROMPT = """
        Введите букву:
        """;
}
