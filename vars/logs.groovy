import utils.colors

void info(String iMessage, boolean isTextBold=false){
        String style = isTextBold ? colors.BOLD : ""
        println("${style}${colors.BLUE}[INFO]\t\t - ${iMessage}${colors.RESET}")
    }

void warning(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.ORANGE}[WARNING]\t - ${iMessage}${colors.RESET}")
}

void error(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.RED}[ERROR]\t\t - ${iMessage}${colors.RESET}")
}

void debug(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.BLACK}[DEBUG]\t\t - ${iMessage}${colors.RESET}")
}

void system(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.YELLOW}[SYSTEM]\t - ${iMessage}${colors.RESET}")
}

void success(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.GREEN}[SUCCESS]\t - ${iMessage}${colors.RESET}")
}