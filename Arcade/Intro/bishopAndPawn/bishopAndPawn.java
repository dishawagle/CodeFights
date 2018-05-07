boolean bishopAndPawn(String bishop, String pawn) {
    
    if(Math.abs(bishop.charAt(0)-pawn.charAt(0))==Math.abs(bishop.charAt(1)-pawn.charAt(1)))
    {
        return true;
    }
    return false;
   
    
}
