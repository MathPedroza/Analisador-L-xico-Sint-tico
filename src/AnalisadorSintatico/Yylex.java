/* The following code was generated by JFlex 1.4.3 on 11/07/21 12:05 */

package AnalisadorSintatico;

import static AnalisadorLexico.Token.*;
import java_cup.runtime.Symbol;
import AnalisadorSintatico.Sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/07/21 12:05 from the specification file
 * <tt>LexerCup.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  0,  1,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1, 12,  0,  0,  0,  0,  5,  0,  6,  8, 14, 13, 34,  7,  0, 15, 
    73, 67,  4,  4,  4,  4,  4,  4,  4, 74, 39, 33,  9, 11, 10,  0, 
     0, 22, 28, 20, 25, 30, 31, 66, 21, 17,  3,  3, 29, 32, 18, 26, 
    60, 65, 23, 58, 19, 27, 24, 57,  3,  3, 72, 35, 75, 36,  0, 16, 
     0, 42, 56, 53, 50, 40, 55, 59, 48, 45,  0, 62, 41, 52, 43, 46, 
    49, 64, 51, 47, 44, 54, 61,  0,  0, 63, 71, 37,  0, 38,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0, 70,  0,  0,  0, 69,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0, 68,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\3\10\1\1\2\6\17\3\1\1\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\5\3\1\4\1\1\1\0"+
    "\1\17\1\0\1\20\1\21\1\10\1\22\1\23\46\0"+
    "\1\24\13\0\1\25\1\26\1\0\1\27\1\30\50\0"+
    "\1\31\2\0\1\32\2\0\1\33\13\0\1\4\16\0"+
    "\1\34\5\0\1\27\16\0\1\35\27\0\1\36\31\0"+
    "\1\37\1\40\6\0\1\41\5\0\1\42\1\0\1\43"+
    "\12\0\1\44\5\0\1\45\1\46\1\0\1\47\5\0"+
    "\1\50\17\0\1\51\22\0\1\52\1\53\25\0\1\54"+
    "\16\0\1\55\1\56\1\0\1\57\11\0\1\60\4\0"+
    "\1\61\11\0\1\62\1\63\3\0\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[400];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\114\0\114\0\230\0\344\0\u0130\0\u017c\0\u01c8"+
    "\0\114\0\u0214\0\u0260\0\u02ac\0\u0260\0\114\0\u02f8\0\u0344"+
    "\0\u0390\0\u03dc\0\u0428\0\u0474\0\u04c0\0\u050c\0\u0558\0\u05a4"+
    "\0\u05f0\0\u063c\0\u0688\0\u06d4\0\u0720\0\u076c\0\u07b8\0\114"+
    "\0\u0804\0\114\0\114\0\114\0\u0850\0\u089c\0\u08e8\0\u0934"+
    "\0\u0980\0\u09cc\0\u0a18\0\u0a64\0\u0ab0\0\u0afc\0\u0b48\0\114"+
    "\0\114\0\114\0\114\0\114\0\u0b94\0\u0be0\0\u0c2c\0\u0c78"+
    "\0\u0cc4\0\u0d10\0\u0d5c\0\u0da8\0\u0df4\0\u0e40\0\u0e8c\0\u0ed8"+
    "\0\u0f24\0\u0f70\0\u0fbc\0\u1008\0\u1054\0\u10a0\0\u10ec\0\u1138"+
    "\0\u1184\0\u11d0\0\u121c\0\u1268\0\u12b4\0\u1300\0\u134c\0\u1398"+
    "\0\u13e4\0\u1430\0\u147c\0\u14c8\0\u1514\0\u1560\0\u15ac\0\u15f8"+
    "\0\u1644\0\u1690\0\u16dc\0\u1728\0\u1774\0\u17c0\0\u180c\0\u1858"+
    "\0\u18a4\0\u18f0\0\u193c\0\u1988\0\u19d4\0\u1a20\0\114\0\114"+
    "\0\u1a6c\0\114\0\114\0\u1ab8\0\u1b04\0\u1b50\0\u1b9c\0\u1be8"+
    "\0\u1c34\0\u1c80\0\u1ccc\0\u1d18\0\u1d64\0\u1db0\0\u1dfc\0\u1e48"+
    "\0\u1e94\0\u1ee0\0\u1f2c\0\u1f78\0\u1fc4\0\u2010\0\u205c\0\u20a8"+
    "\0\u20f4\0\u2140\0\u218c\0\u21d8\0\u2224\0\u2270\0\u22bc\0\u2308"+
    "\0\u2354\0\u23a0\0\u23ec\0\u2438\0\u2484\0\u24d0\0\u251c\0\u2568"+
    "\0\u25b4\0\u2600\0\u264c\0\u2698\0\u26e4\0\u2730\0\114\0\u277c"+
    "\0\u27c8\0\114\0\u2814\0\u2860\0\u28ac\0\u28f8\0\u2944\0\u2990"+
    "\0\u29dc\0\u2a28\0\u2a74\0\u2ac0\0\u2b0c\0\114\0\u2b58\0\u2ba4"+
    "\0\u2bf0\0\u2c3c\0\u2c88\0\u2cd4\0\u2d20\0\u2d6c\0\u2db8\0\u2e04"+
    "\0\u2e50\0\u2e9c\0\u2ee8\0\u2f34\0\u2f80\0\u2fcc\0\u3018\0\u3064"+
    "\0\u30b0\0\u30fc\0\u3148\0\u3194\0\u31e0\0\u322c\0\u3278\0\u32c4"+
    "\0\u3310\0\u335c\0\u33a8\0\u33f4\0\u3440\0\u348c\0\u34d8\0\u3524"+
    "\0\u3570\0\114\0\u35bc\0\u3608\0\u3654\0\u36a0\0\u36ec\0\u3738"+
    "\0\u3784\0\u37d0\0\u381c\0\u3868\0\u38b4\0\u3900\0\u394c\0\u3998"+
    "\0\u39e4\0\u3a30\0\u3a7c\0\u3ac8\0\u3b14\0\u3b60\0\u3bac\0\u3bf8"+
    "\0\u3c44\0\114\0\u3c90\0\u3cdc\0\u3d28\0\u3d74\0\u3dc0\0\u3e0c"+
    "\0\u3e58\0\u3ea4\0\u3ef0\0\u3f3c\0\u3f88\0\u3fd4\0\u4020\0\u406c"+
    "\0\u40b8\0\u4104\0\u4150\0\u419c\0\u41e8\0\u4234\0\u4280\0\u42cc"+
    "\0\u4318\0\u4364\0\u43b0\0\114\0\114\0\u43fc\0\u4448\0\u4494"+
    "\0\u44e0\0\u452c\0\u4578\0\114\0\u45c4\0\u4610\0\u465c\0\u46a8"+
    "\0\u46f4\0\114\0\u4740\0\114\0\u478c\0\u47d8\0\u4824\0\u4870"+
    "\0\u48bc\0\u4908\0\u4954\0\u49a0\0\u49ec\0\u4a38\0\114\0\u4a84"+
    "\0\u4ad0\0\u4b1c\0\u4b68\0\u4bb4\0\114\0\114\0\u4c00\0\114"+
    "\0\u4c4c\0\u4c98\0\u4ce4\0\u4d30\0\u4d7c\0\114\0\u4dc8\0\u4e14"+
    "\0\u4e60\0\u4eac\0\u4ef8\0\u4f44\0\u4f90\0\u4fdc\0\u5028\0\u5074"+
    "\0\u50c0\0\u510c\0\u5158\0\u51a4\0\u51f0\0\114\0\u523c\0\u5288"+
    "\0\u52d4\0\u5320\0\u536c\0\u53b8\0\u5404\0\u5450\0\u549c\0\u54e8"+
    "\0\u5534\0\u5580\0\u55cc\0\u5618\0\u5664\0\u56b0\0\u56fc\0\u5748"+
    "\0\114\0\114\0\u5794\0\u57e0\0\u582c\0\u5878\0\u58c4\0\u5910"+
    "\0\u595c\0\u59a8\0\u59f4\0\u5a40\0\u5a8c\0\u5ad8\0\u5b24\0\u5b70"+
    "\0\u5bbc\0\u5c08\0\u5c54\0\u5ca0\0\u5cec\0\u5d38\0\u5d84\0\114"+
    "\0\u5dd0\0\u5e1c\0\u5e68\0\u5eb4\0\u5f00\0\u5f4c\0\u5f98\0\u5fe4"+
    "\0\u6030\0\u607c\0\u60c8\0\u6114\0\u6160\0\u61ac\0\114\0\114"+
    "\0\u61f8\0\114\0\u6244\0\u6290\0\u62dc\0\u6328\0\u6374\0\u63c0"+
    "\0\u640c\0\u6458\0\u64a4\0\114\0\u64f0\0\u653c\0\u6588\0\u65d4"+
    "\0\114\0\u6620\0\u666c\0\u66b8\0\u6704\0\u6750\0\u679c\0\u67e8"+
    "\0\u6834\0\u6880\0\114\0\114\0\u68cc\0\u6918\0\u6964\0\114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[400];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\2\16\1\17\1\2\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\4\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\21\2\1\46"+
    "\1\47\1\2\1\50\4\2\1\51\1\52\1\53\4\2"+
    "\1\4\2\5\1\54\134\0\1\55\77\0\1\5\76\0"+
    "\1\5\5\0\2\5\6\0\1\56\115\0\1\57\116\0"+
    "\1\60\110\0\1\61\3\0\1\62\113\0\1\62\112\0"+
    "\1\63\142\0\1\64\72\0\1\55\1\0\1\65\30\0"+
    "\1\66\60\0\1\55\35\0\1\67\7\0\1\70\45\0"+
    "\1\55\42\0\1\71\50\0\1\55\4\0\1\72\23\0"+
    "\1\73\1\74\2\0\1\75\1\76\4\0\1\77\50\0"+
    "\1\55\34\0\1\100\56\0\1\55\45\0\1\101\4\0"+
    "\1\102\40\0\1\55\15\0\1\103\11\0\1\104\4\0"+
    "\1\105\56\0\1\55\5\0\1\106\27\0\1\107\55\0"+
    "\1\55\5\0\1\110\3\0\1\111\3\0\1\112\11\0"+
    "\1\113\5\0\1\114\55\0\1\55\32\0\1\115\7\0"+
    "\1\116\50\0\1\55\32\0\1\117\5\0\1\120\52\0"+
    "\1\55\35\0\1\121\55\0\1\55\27\0\1\122\63\0"+
    "\1\55\14\0\1\123\13\0\1\124\4\0\1\125\7\0"+
    "\1\126\32\0\1\127\12\0\1\55\134\0\1\130\100\0"+
    "\1\131\62\0\1\132\51\0\1\133\64\0\1\55\37\0"+
    "\1\134\53\0\1\55\27\0\1\135\3\0\1\136\23\0"+
    "\1\137\33\0\1\55\31\0\1\140\10\0\1\141\2\0"+
    "\1\142\45\0\1\55\45\0\1\143\45\0\1\55\27\0"+
    "\1\144\15\0\1\145\31\0\1\5\1\146\75\0\1\5"+
    "\5\0\2\5\101\0\1\147\16\0\1\150\15\0\20\150"+
    "\30\0\2\150\1\0\1\150\4\0\2\150\5\0\1\150"+
    "\3\0\2\56\1\0\111\56\4\0\1\151\76\0\1\151"+
    "\5\0\2\151\24\0\1\152\144\0\1\153\65\0\1\154"+
    "\24\0\1\155\1\156\123\0\1\157\104\0\1\160\64\0"+
    "\1\161\137\0\1\162\120\0\1\163\117\0\1\164\103\0"+
    "\1\165\110\0\1\166\113\0\1\167\117\0\1\170\122\0"+
    "\1\171\56\0\1\172\136\0\1\173\1\174\1\0\1\175"+
    "\2\0\1\176\5\0\1\177\121\0\1\200\47\0\1\201"+
    "\141\0\1\202\61\0\1\203\123\0\1\204\104\0\1\205"+
    "\140\0\1\206\15\0\1\207\112\0\1\210\2\0\1\211"+
    "\53\0\1\212\1\0\1\213\142\0\1\214\106\0\1\215"+
    "\1\216\117\0\1\217\107\0\1\220\124\0\1\221\56\0"+
    "\1\222\137\0\1\223\120\0\1\224\103\0\1\225\100\0"+
    "\1\226\114\0\1\227\61\0\1\230\113\0\1\231\153\0"+
    "\1\232\121\0\1\233\112\0\1\234\122\0\1\235\116\0"+
    "\1\236\112\0\1\237\103\0\1\240\1\241\125\0\1\242"+
    "\73\0\1\243\116\0\1\244\112\0\1\245\101\0\1\226"+
    "\42\0\1\226\14\0\1\151\3\0\1\246\72\0\1\151"+
    "\5\0\2\151\66\0\1\247\61\0\1\250\102\0\1\251"+
    "\161\0\1\252\75\0\1\253\70\0\1\152\143\0\1\254"+
    "\121\0\1\255\113\0\1\256\113\0\1\257\100\0\1\260"+
    "\124\0\1\261\106\0\1\262\105\0\1\263\100\0\1\152"+
    "\130\0\1\264\123\0\1\265\117\0\1\266\101\0\1\267"+
    "\113\0\1\270\117\0\1\271\57\0\1\272\151\0\1\153"+
    "\67\0\1\273\111\0\1\274\100\0\1\275\142\0\1\276"+
    "\120\0\1\277\126\0\1\300\103\0\1\301\103\0\1\302"+
    "\124\0\1\303\102\0\1\304\143\0\1\305\76\0\1\116"+
    "\102\0\1\306\112\0\1\307\116\0\1\310\65\0\1\65"+
    "\137\0\1\66\125\0\1\311\114\0\1\312\63\0\1\313"+
    "\166\0\1\314\115\0\1\315\52\0\1\316\64\0\1\317"+
    "\146\0\1\320\110\0\1\321\137\0\1\322\112\0\1\323"+
    "\72\0\1\324\110\0\1\325\125\0\1\326\100\0\1\327"+
    "\126\0\1\330\104\0\1\331\112\0\1\332\126\0\1\333"+
    "\75\0\1\334\116\0\1\335\117\0\1\336\106\0\1\337"+
    "\112\0\1\340\130\0\1\341\101\0\1\342\111\0\1\343"+
    "\62\0\1\344\165\0\1\345\73\0\1\346\72\0\1\347"+
    "\144\0\1\350\113\0\1\351\102\0\1\352\115\0\1\353"+
    "\64\0\1\72\111\0\1\354\125\0\1\355\116\0\1\103"+
    "\127\0\1\356\112\0\1\357\111\0\1\360\117\0\1\361"+
    "\107\0\1\362\124\0\1\363\114\0\1\364\116\0\1\365"+
    "\101\0\1\366\107\0\1\367\66\0\1\370\142\0\1\371"+
    "\111\0\1\372\107\0\1\373\113\0\1\374\117\0\1\375"+
    "\131\0\1\376\100\0\1\377\123\0\1\340\102\0\1\u0100"+
    "\113\0\1\u0101\111\0\1\u0102\120\0\1\u0103\135\0\1\u0104"+
    "\77\0\1\u0105\112\0\1\u0106\106\0\1\u0107\113\0\1\215"+
    "\107\0\1\u0108\125\0\1\u0109\123\0\1\256\70\0\1\u010a"+
    "\125\0\1\u010b\101\0\1\u010c\126\0\1\u010d\113\0\1\u010e"+
    "\103\0\1\u010f\112\0\1\u0110\115\0\1\u0111\112\0\1\u0112"+
    "\113\0\1\153\115\0\1\u0113\111\0\1\u0114\63\0\1\u0115"+
    "\111\0\1\u0116\130\0\1\152\125\0\1\u0117\113\0\1\u0118"+
    "\113\0\1\153\114\0\1\u0119\112\0\1\u011a\115\0\1\u011b"+
    "\111\0\1\u011c\113\0\1\u011d\113\0\1\u011e\115\0\1\350"+
    "\117\0\1\u011f\111\0\1\u0120\126\0\1\u0121\42\0\1\u0122"+
    "\146\0\1\u0123\135\0\1\153\113\0\1\u0124\74\0\1\u0124"+
    "\124\0\1\u0125\113\0\1\u0126\100\0\1\u0127\111\0\1\u0128"+
    "\121\0\1\u0129\106\0\1\u011d\71\0\1\u012a\134\0\1\u012b"+
    "\126\0\1\u012c\130\0\1\u012d\100\0\1\u012e\132\0\1\u012f"+
    "\64\0\1\u0130\107\0\1\u0131\127\0\1\u0132\121\0\1\u0133"+
    "\76\0\1\u0134\75\0\1\355\77\0\1\u0135\137\0\1\u0136"+
    "\117\0\1\u0137\113\0\1\u0138\121\0\1\u011d\60\0\1\u0139"+
    "\140\0\1\u013a\102\0\1\u013b\121\0\1\u012b\112\0\1\u0126"+
    "\117\0\1\u013c\110\0\1\u013d\124\0\1\u0104\104\0\1\u012b"+
    "\110\0\1\u013e\100\0\1\u013f\126\0\1\u0140\131\0\1\u0141"+
    "\110\0\1\u0142\135\0\1\u0143\64\0\1\u0144\134\0\1\u011d"+
    "\70\0\1\u0145\125\0\1\u0146\62\0\1\u0147\134\0\1\u0148"+
    "\105\0\1\u0149\113\0\1\u014a\120\0\1\u014b\61\0\1\u014c"+
    "\201\0\1\u014d\52\0\1\u014e\120\0\1\u014f\107\0\1\u0150"+
    "\112\0\1\u0151\116\0\1\u0152\115\0\1\u0153\106\0\1\u0154"+
    "\147\0\1\u0155\62\0\1\u0156\110\0\1\u0157\114\0\1\u0158"+
    "\112\0\1\u0159\116\0\1\u015a\133\0\1\u015b\76\0\1\u015c"+
    "\44\0\1\u015d\166\0\1\u0126\140\0\1\345\56\0\1\u015e"+
    "\130\0\1\u015f\100\0\1\u0160\111\0\1\u0161\125\0\1\u0162"+
    "\135\0\1\u0163\64\0\1\u0164\116\0\1\u012b\103\0\1\u0165"+
    "\130\0\1\u0166\103\0\1\u0167\114\0\1\u0166\62\0\1\u0168"+
    "\176\0\1\u0169\55\0\1\u016a\113\0\1\u016b\74\0\1\u016c"+
    "\126\0\1\u016d\121\0\1\u0161\115\0\1\u016e\116\0\1\u010c"+
    "\104\0\1\u016f\113\0\1\u0170\114\0\1\u0171\102\0\1\u0172"+
    "\124\0\1\u0173\61\0\1\u0174\140\0\1\u0175\116\0\1\u0176"+
    "\115\0\1\u0177\131\0\1\u0178\76\0\1\u0179\113\0\1\u017a"+
    "\124\0\1\u017b\100\0\1\u011d\120\0\1\u017c\112\0\1\u017d"+
    "\106\0\1\u017e\67\0\1\u017f\140\0\1\u0180\113\0\1\u0181"+
    "\116\0\1\u0182\111\0\1\u0183\61\0\1\u0184\150\0\1\u0185"+
    "\126\0\1\u0186\76\0\1\u0187\112\0\1\u0188\116\0\1\u0189"+
    "\62\0\1\u018a\145\0\1\u018b\106\0\1\u018c\114\0\1\u018d"+
    "\131\0\1\u018e\100\0\1\u018f\107\0\1\u0190\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[27056];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\5\1\1\11\4\1\1\11\21\1\1\11"+
    "\1\1\3\11\10\1\1\0\1\1\1\0\5\11\46\0"+
    "\1\1\13\0\2\11\1\0\2\11\50\0\1\1\2\0"+
    "\1\11\2\0\1\11\13\0\1\11\16\0\1\1\5\0"+
    "\1\1\16\0\1\11\27\0\1\11\31\0\2\11\6\0"+
    "\1\11\5\0\1\11\1\0\1\11\12\0\1\11\5\0"+
    "\2\11\1\0\1\11\5\0\1\11\17\0\1\11\22\0"+
    "\2\11\25\0\1\11\16\0\2\11\1\0\1\11\11\0"+
    "\1\11\4\0\1\11\11\0\2\11\3\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[400];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 21: 
          { return new Symbol(Sym.quebra_linha, yychar, yyline, yytext());
          }
        case 53: break;
        case 7: 
          { return new Symbol(Sym.fecha_parenteses, yychar, yyline, yytext());
          }
        case 54: break;
        case 30: 
          { return new Symbol(Sym.criar_metodo, yychar, yyline, yytext());
          }
        case 55: break;
        case 47: 
          { return new Symbol(Sym.variavel, yychar, yyline, yytext());
          }
        case 56: break;
        case 28: 
          { return new Symbol(Sym.ler_metodo, yychar, yyline, yytext());
          }
        case 57: break;
        case 33: 
          { return new Symbol(Sym.propriedades_operacoes, yychar, yyline, yytext());
          }
        case 58: break;
        case 9: 
          { return new Symbol(Sym.virgula, yychar, yyline, yytext());
          }
        case 59: break;
        case 39: 
          { return new Symbol(Sym.format, yychar, yyline, yytext());
          }
        case 60: break;
        case 26: 
          { return new Symbol(Sym.final_linha_classe, yychar, yyline, yytext());
          }
        case 61: break;
        case 16: 
          { return new Symbol(Sym.criacao_de_classe, yychar, yyline, yytext());
          }
        case 62: break;
        case 14: 
          { return new Symbol(Sym.inicio_funcao, yychar, yyline, yytext());
          }
        case 63: break;
        case 32: 
          { return new Symbol(Sym.enquanto, yychar, yyline, yytext());
          }
        case 64: break;
        case 43: 
          { return new Symbol(Sym.on_update, yychar, yyline, yytext());
          }
        case 65: break;
        case 34: 
          { return new Symbol(Sym.classe, yychar, yyline, yytext());
          }
        case 66: break;
        case 35: 
          { return new Symbol(Sym.shape, yychar, yyline, yytext());
          }
        case 67: break;
        case 42: 
          { return new Symbol(Sym.on_delete, yychar, yyline, yytext());
          }
        case 68: break;
        case 6: 
          { return new Symbol(Sym.oparitmetico, yychar, yyline, yytext());
          }
        case 69: break;
        case 11: 
          { return new Symbol(Sym.fecha_colchete, yychar, yyline, yytext());
          }
        case 70: break;
        case 4: 
          { return new Symbol(Sym.numero, yychar, yyline, yytext());
          }
        case 71: break;
        case 31: 
          { return new Symbol(Sym.multiplicidade, yychar, yyline, yytext());
          }
        case 72: break;
        case 41: 
          { return new Symbol(Sym.enquanto_for, yychar, yyline, yytext());
          }
        case 73: break;
        case 24: 
          { return new Symbol(Sym.retorno, yychar, yyline, yytext());
          }
        case 74: break;
        case 5: 
          { return new Symbol(Sym.abre_parenteses, yychar, yyline, yytext());
          }
        case 75: break;
        case 29: 
          { return new Symbol(Sym.func, yychar, yyline, yytext());
          }
        case 76: break;
        case 50: 
          { return new Symbol(Sym.number_relationship, yychar, yyline, yytext());
          }
        case 77: break;
        case 51: 
          { return new Symbol(Sym.opcoes_fk, yychar, yyline, yytext());
          }
        case 78: break;
        case 18: 
          { return new Symbol(Sym.atribuicao_func, yychar, yyline, yytext());
          }
        case 79: break;
        case 3: 
          { return new Symbol(Sym.letra, yychar, yyline, yytext());
          }
        case 80: break;
        case 17: 
          { return new Symbol(Sym.atribuicao_classe, yychar, yyline, yytext());
          }
        case 81: break;
        case 27: 
          { return new Symbol(Sym.retorno_metodo, yychar, yyline, yytext());
          }
        case 82: break;
        case 37: 
          { return new Symbol(Sym.associacoes_atributos, yychar, yyline, yytext());
          }
        case 83: break;
        case 12: 
          { return new Symbol(Sym.abre_chave, yychar, yyline, yytext());
          }
        case 84: break;
        case 8: 
          { return new Symbol(Sym.relacional, yychar, yyline, yytext());
          }
        case 85: break;
        case 25: 
          { return new Symbol(Sym.para, yychar, yyline, yytext());
          }
        case 86: break;
        case 48: 
          { return new Symbol(Sym.relationship, yychar, yyline, yytext());
          }
        case 87: break;
        case 45: 
          { return new Symbol(Sym.navegabilidade, yychar, yyline, yytext());
          }
        case 88: break;
        case 10: 
          { return new Symbol(Sym.abre_colchete, yychar, yyline, yytext());
          }
        case 89: break;
        case 44: 
          { return new Symbol(Sym.concurrent, yychar, yyline, yytext());
          }
        case 90: break;
        case 19: 
          { return new Symbol(Sym.final_linha, yychar, yyline, yytext());
          }
        case 91: break;
        case 22: 
          { return new Symbol(Sym.atributos_da_classe, yychar, yyline, yytext());
          }
        case 92: break;
        case 49: 
          { return new Symbol(Sym.relacionamento, yychar, yyline, yytext());
          }
        case 93: break;
        case 46: 
          { return new Symbol(Sym.define_const, yychar, yyline, yytext());
          }
        case 94: break;
        case 40: 
          { return new Symbol(Sym.atributos_visibilidade, yychar, yyline, yytext());
          }
        case 95: break;
        case 1: 
          { System.err.println("Caracter ilegal: " +yytext());
          }
        case 96: break;
        case 38: 
          { return new Symbol(Sym.alterar_metodo, yychar, yyline, yytext());
          }
        case 97: break;
        case 13: 
          { return new Symbol(Sym.fecha_chave, yychar, yyline, yytext());
          }
        case 98: break;
        case 52: 
          { return new Symbol(Sym.relacionamentos_classes, yychar, yyline, yytext());
          }
        case 99: break;
        case 15: 
          { /*Ignore*/
          }
        case 100: break;
        case 20: 
          { return new Symbol(Sym.tipo_atributo, yychar, yyline, yytext());
          }
        case 101: break;
        case 36: 
          { return new Symbol(Sym.excluir_metodo, yychar, yyline, yytext());
          }
        case 102: break;
        case 23: 
          { return new Symbol(Sym.tipos, yychar, yyline, yytext());
          }
        case 103: break;
        case 2: 
          { /*Igonore*/
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return new Symbol (Sym.EOF, new String("Fim do arquivo")); // específica um valor de retorno ao final do arquivo
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
