/* Generated By:JavaCC: Do not edit this line. SQLParserTokenManager.java */
package edu.buffalo.db.parser;
import java.util.Vector;
import edu.buffalo.db.parser.sqlexpr.*;

/** Token Manager. */
public class SQLParserTokenManager implements SQLParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(0, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(0, 0);
      case 12:
         jjmatchedKind = 5;
         return jjMoveNfa_0(0, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(0, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(0, 0);
      case 37:
         jjmatchedKind = 7;
         return jjMoveNfa_0(0, 0);
      case 44:
         jjmatchedKind = 20;
         return jjMoveNfa_0(0, 0);
      case 46:
         jjmatchedKind = 21;
         return jjMoveNfa_0(0, 0);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 59:
         jjmatchedKind = 19;
         return jjMoveNfa_0(0, 0);
      case 61:
         jjmatchedKind = 18;
         return jjMoveNfa_0(0, 0);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 0);
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 1;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 1);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 2);
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 77:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 3;
         }
         break;
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 109:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 3;
         }
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 3);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 78:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 4);
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 84:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 5;
         }
         break;
      case 116:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 5);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 6);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 6);
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      default :
         break;
   }
   return jjMoveNfa_0(0, 7);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(0, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(0, 7);
   }
   switch(curChar)
   {
      case 76:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 8;
         }
         break;
      case 108:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 8;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(0, 8);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAdd(1);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 3:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 5:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if (curChar == 34 && kind > 14)
                     kind = 14;
                  break;
               case 7:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 6);
                  break;
               case 8:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 9:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(12);
                  break;
               case 3:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if (curChar == 92)
                     jjAddStates(7, 9);
                  break;
               case 5:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 8)
                     kind = 8;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 3:
                  if (curChar == 70)
                     kind = 8;
                  break;
               case 4:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   3, 4, 6, 3, 4, 8, 6, 5, 7, 9, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\75", "\73", "\54", "\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3cfc01L, 
};
static final long[] jjtoSkip = {
   0x33eL, 
};
static final long[] jjtoSpecial = {
   0x300L, 
};
static final long[] jjtoMore = {
   0xc0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[13];
static private final int[] jjstateSet = new int[26];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public SQLParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public SQLParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 9)
         {
            jjmatchedKind = 9;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}