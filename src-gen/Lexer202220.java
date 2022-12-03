// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Lexer202220.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Lexer202220 {
  public static String currentString=null;
  static {
    int $line=0;
    $line=3;
    $try:try {
      currentString=$defaultValue(String.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static GArrayList images=null;
  static {
    int $line=0;
    $line=4;
    $try:try {
      images=$invokeConstructor(GArrayList.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet allSymbols=null;
  static {
    int $line=0;
    $line=6;
    $try:try {
      allSymbols=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet keyWords=null;
  static {
    int $line=0;
    $line=7;
    $try:try {
      keyWords=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet skipChars=null;
  static {
    int $line=0;
    $line=8;
    $try:try {
      skipChars=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet preKW=null;
  static {
    int $line=0;
    $line=10;
    $try:try {
      preKW=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet preOps=null;
  static {
    int $line=0;
    $line=11;
    $try:try {
      preOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet StartOps=null;
  static {
    int $line=0;
    $line=13;
    $try:try {
      StartOps=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet Symbols1=null;
  static {
    int $line=0;
    $line=14;
    $try:try {
      Symbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet CharsSymbols1=null;
  static {
    int $line=0;
    $line=16;
    $try:try {
      CharsSymbols1=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet alphaUpper=null;
  static {
    int $line=0;
    $line=18;
    $try:try {
      alphaUpper=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet alphaLower=null;
  static {
    int $line=0;
    $line=19;
    $try:try {
      alphaLower=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet digits=null;
  static {
    int $line=0;
    $line=20;
    $try:try {
      digits=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet alphaNum=null;
  static {
    int $line=0;
    $line=22;
    $try:try {
      alphaNum=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet Out=null;
  static {
    int $line=0;
    $line=24;
    $try:try {
      Out=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static Boolean diffIdents=null;
  static {
    int $line=0;
    $line=25;
    $try:try {
      diffIdents=$defaultValue(Boolean.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static ISet Ids=null;
  static {
    int $line=0;
    $line=27;
    $try:try {
      Ids=$defaultValue(ISet.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static GHashTableMap translation=null;
  static {
    int $line=0;
    $line=28;
    $try:try {
      translation=$invokeConstructor(GHashTableMap.class,new Object[]{});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,null,$line);
    }
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=31;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)(Lexer202220.chars(s)))));
      }
      $result=$v5;
      if (true) break $try;
      $line=33;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object elements(Object array) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(0);
      int $v10=$int($opAbsolY(array))-1;
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($getArrayValue(array,new Object[]{i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=35;
      $rethrow(new RuntimeException("The function \"elements(array:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"elements",$line);
    }
    return $result;
  }
  public static Object prefixes(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v11=$newSet();
      int $v13=$int(1);
      int $v14=$int($invokeMethod("length",string,new Object[]{}));
      $v12:for (int i=$v13; i<=$v14; i++) {
        $v11.add($invokeMethod("substring",string,new Object[]{0,i}));
      }
      $result=$v11;
      if (true) break $try;
      $line=37;
      $rethrow(new RuntimeException("The function \"prefixes(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"prefixes",$line);
    }
    return $result;
  }
  public static Object splits(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v15=$newSet();
      int $v17=$int(1);
      int $v18=$int($opSubtrY($invokeMethod("length",string,new Object[]{}),1));
      $v16:for (int i=$v17; i<=$v18; i++) {
        $v15.add(GCollections.asList($invokeMethod("substring",string,new Object[]{0,i}),$invokeMethod("substring",string,new Object[]{i,$invokeMethod("length",string,new Object[]{})})));
      }
      $result=$v15;
      if (true) break $try;
      $line=38;
      $rethrow(new RuntimeException("The function \"splits(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"splits",$line);
    }
    return $result;
  }
  public static Object allPrefixes(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v19=$newSet(GCollections.emptySet());
      $v20:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v19.union(GCollections.unmodifiableSet(((java.lang.Iterable)(Lexer202220.prefixes(s)))));
      }
      $result=$v19;
      if (true) break $try;
      $line=40;
      $rethrow(new RuntimeException("The function \"allPrefixes(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"allPrefixes",$line);
    }
    return $result;
  }
  public static Object translationGet(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result=(($bool((($opEqualY($opAbsolY(q),1)&&$opMembrY(q,Symbols1))&&!$opEqualY(q,'\n'))))?(q):(((gold.structures.map.GHashTableMap)translation).get(q)));
      if (true) break $try;
      $line=42;
      $rethrow(new RuntimeException("The function \"translationGet(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"translationGet",$line);
    }
    return $result;
  }
  public static Object runLexer(Object M, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=45;
      currentString=$cast(String.class,$fix(""));
      $line=46;
      images=$cast(GArrayList.class,$fix($invokeConstructor(GArrayList.class,new Object[]{})));
      $line=47;
      Object result=$fix($invokeMethod("acceptsString",M,new Object[]{input}));
      $line=48;
      $result=GCollections.asList(result,images);
      if (true) break $try;
      $line=49;
      $rethrow(new RuntimeException("The function \"runLexer(M:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"runLexer",$line);
    }
    return $result;
  }
  public static Object problems(String q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=53;
      if ($opMembrY(q,allSymbols)) {
        $line=53;
        $result=false;
        if (true) break $try;
      }
      else {
        $line=54;
        if ($opLessqY($opAbsolY(q),1)) {
          $line=54;
          $result=true;
          if (true) break $try;
        }
        else {
          $line=56;
          for (Object $v21:GCollections.unmodifiableCollection(Lexer202220.splits(q))) {
            java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
            Object s=$v22.next();
            Object t=$v22.next();
            $line=57;
            if ((!$bool(Lexer202220.problems($cast(java.lang.String.class,s)))&&!$bool(Lexer202220.problems($cast(java.lang.String.class,t))))) {
              $line=57;
              $result=false;
              if (true) break $try;
            }
          }
          $line=59;
          $result=true;
          if (true) break $try;
        }
      }
      $line=61;
      $rethrow(new RuntimeException("The function \"problems(q:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"problems",$line);
    }
    return $result;
  }
  public static Object translationPreOps(Object state) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=65;
      Object x=null;
      Object y=null;
      $line=66;
      String q=null;
      q=$defaultValue(String.class);
      $line=67;
      q=$cast(String.class,$fix(state));
      $line=68;
      Object n=$fix(((java.lang.String)q).length());
      $line=69;
      if ($opEqualY(n,0)) {
        $line=69;
        $result="";
        if (true) break $try;
      }
      else {
        $line=70;
        if ($opMembrY(q,allSymbols)) {
          $line=71;
          ((gold.structures.list.GArrayList)images).add(q);
          $line=72;
          $result=Lexer202220.translationGet(q);
          if (true) break $try;
        }
        else {
          $line=73;
          if ($opEqualY(n,1)) {
            $line=73;
            $result="";
            if (true) break $try;
          }
          else {
            $line=75;
            for (Object $v23:GCollections.unmodifiableCollection(Lexer202220.splits(q))) {
              java.util.Iterator $v24=GCollections.unmodifiableCollection($v23).iterator();
              Object s=$v24.next();
              Object t=$v24.next();
              $line=76;
              x=$fix(Lexer202220.translationPreOps(s));
              $line=77;
              y=$fix(Lexer202220.translationPreOps(t));
              $line=78;
              if ((!$opEqualY(x,"")&&!$opEqualY(y,""))) {
                $line=79;
                $result=$opAdditY(x,y);
                if (true) break $try;
              }
            }
            $line=81;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=83;
      $rethrow(new RuntimeException("The function \"translationPreOps(state:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"translationPreOps",$line);
    }
    return $result;
  }
  public static ITransducer createLexer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=87;
      Lexer202220.initialize();
      $line=89;
      preOps=$cast(ISet.class,$fix(Lexer202220.allPrefixes(allSymbols)));
      $line=90;
      preKW=$cast(ISet.class,$fix(Lexer202220.allPrefixes(keyWords)));
      $line=91;
      gold.structures.set.ISet $v25=$newSet(GCollections.emptySet());
      $v26:for (Object x:GCollections.unmodifiableCollection(allSymbols)) {
        $v25.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      StartOps=$cast(ISet.class,$fix($v25));
      $line=92;
      gold.structures.set.ISet $v27=$newSet(GCollections.emptySet());
      $v28:for (Object x:GCollections.unmodifiableCollection(StartOps)) {
        $v27.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($opAdditY("",x))))));
      }
      Symbols1=$cast(ISet.class,$fix($opInterY($v27,allSymbols)));
      $line=93;
      gold.structures.set.ISet $v29=$newSet(GCollections.emptySet());
      $v30:for (Object x:GCollections.unmodifiableCollection(Symbols1)) {
        $v29.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet($invokeMethod("charAt",x,new Object[]{0}))))));
      }
      CharsSymbols1=$cast(ISet.class,$fix($v29));
      $line=94;
      gold.structures.set.ISet $v31=$newSet(GCollections.emptySet());
      $v32:for (Object x:GCollections.unmodifiableCollection(((gold.structures.map.GHashTableMap)translation).values())) {
        $v31.union(GCollections.unmodifiableSet(((java.lang.Iterable)(GCollections.asSet(x)))));
      }
      Out=$cast(ISet.class,$fix($opUnionY(CharsSymbols1,$v31)));
      $line=96;
      System.out.println($message(new Object[]{Out}));
      $line=97;
      Ids=$cast(ISet.class,$fix(GCollections.asSet("IdU","IdL")));
      $line=99;
      Object Q=$fix($opUnionY($opUnionY(GCollections.asSet("INIT","IdU","Num","Err","IdL"),preKW),preOps));
      $line=101;
      System.out.println($message(new Object[]{Q}));
      $line=103;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY(alphaNum,Lexer202220.charsStrings(allSymbols)),skipChars),GCollections.asSet(':','-')));
      $line=106;
      Object q_0=$fix("INIT");
      $line=107;
      Object F=$fix(GCollections.asSet("INIT"));
      $line=108;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Lexer202220.class,"\u03B4"),new GMethod(Lexer202220.class,"g"),new GMethod(Lexer202220.class,"h")});
      if (true) break $try;
      $line=109;
      $rethrow(new RuntimeException("The function \"createLexer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"createLexer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=114;
      String q=null;
      q=$defaultValue(String.class);
      $line=115;
      q=$cast(String.class,$fix(state));
      $line=116;
      if ($opEqualY(q,"Err")) {
        $line=116;
        $result="Err";
        if (true) break $try;
      }
      else {
        $line=117;
        if ($opMembrY(q,preOps)) {
          $line=118;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=118;
            $result=$opAdditY(q,\u03C3);
            if (true) break $try;
          }
          else {
            $line=119;
            if ($bool(Lexer202220.problems($cast(java.lang.String.class,q)))) {
              $line=119;
              $result="Err";
              if (true) break $try;
            }
            else {
              $line=120;
              if ($opMembrY(\u03C3,skipChars)) {
                $line=120;
                $result="INIT";
                if (true) break $try;
              }
              else {
                $line=121;
                if ($opMembrY(\u03C3,$opIntvlY('0','9'))) {
                  $line=121;
                  $result="Num";
                  if (true) break $try;
                }
                else {
                  $line=122;
                  if ($opMembrY($opAdditY("",\u03C3),preKW)) {
                    $line=122;
                    $result=$opAdditY("",\u03C3);
                    if (true) break $try;
                  }
                  else {
                    $line=123;
                    if ($opMembrY(\u03C3,alphaUpper)) {
                      $line=123;
                      $result="IdU";
                      if (true) break $try;
                    }
                    else {
                      $line=124;
                      if ($opMembrY(\u03C3,alphaLower)) {
                        $line=124;
                        $result="IdL";
                        if (true) break $try;
                      }
                      else {
                        $line=125;
                        if ($opMembrY($opAdditY("",\u03C3),preOps)) {
                          $line=125;
                          $result=$opAdditY("",\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=126;
                          $result="Err";
                          if (true) break $try;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        else {
          $line=128;
          if (((($opMembrY(\u03C3,skipChars)&&$opMembrY(q,preKW))&&!$bool($opMembrY(q,keyWords)))&&$opEqualY(((java.lang.String)q).charAt($int(0)),':'))) {
            $line=128;
            $result="Err";
            if (true) break $try;
          }
          else {
            $line=129;
            if ($opMembrY(\u03C3,skipChars)) {
              $line=129;
              $result="INIT";
              if (true) break $try;
            }
            else {
              $line=130;
              if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                $line=130;
                $result="Num";
                if (true) break $try;
              }
              else {
                $line=131;
                if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preKW))) {
                  $line=131;
                  $result=$opAdditY("",\u03C3);
                  if (true) break $try;
                }
                else {
                  $line=132;
                  if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaUpper))) {
                    $line=132;
                    $result="IdU";
                    if (true) break $try;
                  }
                  else {
                    $line=133;
                    if (($opEqualY(q,"INIT")&&$opMembrY(\u03C3,alphaLower))) {
                      $line=133;
                      $result="IdL";
                      if (true) break $try;
                    }
                    else {
                      $line=134;
                      if (($opEqualY(q,"INIT")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                        $line=134;
                        $result=$opAdditY("",\u03C3);
                        if (true) break $try;
                      }
                      else {
                        $line=135;
                        if (($opMembrY(q,preKW)&&$opMembrY($opAdditY(q,\u03C3),preKW))) {
                          $line=135;
                          $result=$opAdditY(q,\u03C3);
                          if (true) break $try;
                        }
                        else {
                          $line=136;
                          if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY(((java.lang.String)q).charAt($int(0)),alphaUpper))) {
                            $line=136;
                            $result="IdU";
                            if (true) break $try;
                          }
                          else {
                            $line=137;
                            if ((($opMembrY(q,preKW)&&$opMembrY(\u03C3,alphaNum))&&$opMembrY(((java.lang.String)q).charAt($int(0)),alphaLower))) {
                              $line=137;
                              $result="IdL";
                              if (true) break $try;
                            }
                            else {
                              $line=138;
                              if (($opMembrY(q,preKW)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                $line=138;
                                $result=$opAdditY("",\u03C3);
                                if (true) break $try;
                              }
                              else {
                                $line=139;
                                if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                                  $line=139;
                                  $result="Num";
                                  if (true) break $try;
                                }
                                else {
                                  $line=140;
                                  if (($opEqualY(q,"Num")&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                    $line=140;
                                    $result=$opAdditY("",\u03C3);
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=141;
                                    if (($opEqualY(q,"Num")&&$opMembrY(\u03C3,alphaNum))) {
                                      $line=141;
                                      $result="Err";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=142;
                                      if (($opMembrY(q,Ids)&&$opMembrY(\u03C3,alphaNum))) {
                                        $line=142;
                                        $result=q;
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=143;
                                        if (($opMembrY(q,Ids)&&$opMembrY($opAdditY("",\u03C3),preOps))) {
                                          $line=143;
                                          $result=$opAdditY("",\u03C3);
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=144;
                                          $result="Err";
                                          if (true) break $try;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=146;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=152;
      $result="";
      if (true) break $try;
      $line=153;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"g",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=156;
      String s=null;
      s=$defaultValue(String.class);
      $line=157;
      s=$cast(String.class,$fix((($bool($opEqualY(\u03C3,'\n')))?("\\n"):($opAdditY("",\u03C3)))));
      $line=159;
      if ($opMembrY(q,preOps)) {
        $line=160;
        if (($opMembrY(\u03C3,skipChars)&&$opMembrY(q,allSymbols))) {
          $line=161;
          ((gold.structures.list.GArrayList)images).add(currentString);
          $line=162;
          currentString=$cast(String.class,$fix(""));
          $line=163;
          $result=Lexer202220.translationGet(q);
          if (true) break $try;
        }
        else {
          $line=164;
          if ($opMembrY($opAdditY(q,\u03C3),preOps)) {
            $line=165;
            currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
            $line=166;
            $result="";
            if (true) break $try;
          }
          else {
            $line=167;
            if (($opMembrY(\u03C3,$opUnionY(StartOps,alphaNum))&&$opMembrY(q,allSymbols))) {
              $line=168;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=169;
              currentString=$cast(String.class,$fix($opAdditY("",s)));
              $line=170;
              $result=Lexer202220.translationGet(q);
              if (true) break $try;
            }
            else {
              $line=171;
              if ($opMembrY(\u03C3,$opUnionY($opUnionY($opUnionY(StartOps,alphaNum),skipChars),GCollections.asSet(':')))) {
                $line=172;
                currentString=$cast(String.class,$fix($opAdditY("",s)));
                $line=173;
                $result=Lexer202220.translationPreOps(q);
                if (true) break $try;
              }
              else {
                $line=175;
                currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
                $line=176;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      else {
        $line=180;
        if ((!$opMembrY(q,GCollections.asSet("Err"))&&$opMembrY(\u03C3,$opUnionY(skipChars,StartOps)))) {
          $line=181;
          if ($opEqualY(q,"INIT")) {
            $line=182;
            currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,StartOps)))?(s):(""))));
            $line=183;
            $result="";
            if (true) break $try;
          }
          else {
            $line=184;
            if ($opEqualY(Lexer202220.translationGet(q),null)) {
              $line=186;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=187;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=188;
              Object f=$fix($invokeMethod("charAt",q,new Object[]{0}));
              $line=189;
              if ($opMembrY(f,alphaUpper)) {
                $line=189;
                $result=Lexer202220.translationGet("IdU");
                if (true) break $try;
              }
              else {
                $line=190;
                if ($opMembrY(f,alphaLower)) {
                  $line=191;
                  $result=Lexer202220.translationGet("IdL");
                  if (true) break $try;
                }
                else {
                  $line=192;
                  $result=null;
                  if (true) break $try;
                }
              }
            }
            else {
              $line=195;
              ((gold.structures.list.GArrayList)images).add(currentString);
              $line=196;
              currentString=$cast(String.class,$fix((($bool($opMembrY(\u03C3,$opUnionY(skipChars,StartOps))))?(s):(""))));
              $line=197;
              $result=Lexer202220.translationGet(q);
              if (true) break $try;
            }
          }
        }
        else {
          $line=200;
          currentString=$cast(String.class,$fix($opAdditY(currentString,s)));
          $line=201;
          $result="";
          if (true) break $try;
        }
      }
      $line=204;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"h",$line);
    }
    return $result;
  }
  public static Object initialize() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=273;
      skipChars=$cast(ISet.class,$fix(GCollections.asSet(' ','\t','\n')));
      $line=274;
      alphaUpper=$cast(ISet.class,$fix($opIntvlY('A','Z')));
      $line=275;
      alphaLower=$cast(ISet.class,$fix($opIntvlY('a','z')));
      $line=276;
      digits=$cast(ISet.class,$fix($opIntvlY('0','9')));
      $line=277;
      alphaNum=$cast(ISet.class,$fix($opUnionY($opUnionY(alphaUpper,alphaLower),digits)));
      $line=279;
      allSymbols=$cast(ISet.class,$fix(GCollections.asSet("(",")",",",":=",";","{","}")));
      $line=280;
      keyWords=$cast(ISet.class,$fix(GCollections.asSet("walk","jumpTo","veer","look","jump","drop","grab","get","free","pop","front","back","left","right","north","south","east","west","if","fi","else","while","do","od","repeatTimes","per","isFacing","isValid","canWalk","not","PROG","GORP","PROC","CORP","var")));
      $line=291;
      ((gold.structures.map.GHashTableMap)translation).put("IdL",'v');
      $line=292;
      ((gold.structures.map.GHashTableMap)translation).put("IdU",'v');
      $line=294;
      ((gold.structures.map.GHashTableMap)translation).put("Num",'#');
      $line=296;
      ((gold.structures.map.GHashTableMap)translation).put("walk",'w');
      $line=297;
      ((gold.structures.map.GHashTableMap)translation).put("jumpTo",'j');
      $line=298;
      ((gold.structures.map.GHashTableMap)translation).put("veer",'v');
      $line=299;
      ((gold.structures.map.GHashTableMap)translation).put("look",'l');
      $line=300;
      ((gold.structures.map.GHashTableMap)translation).put("jump",'@');
      $line=301;
      ((gold.structures.map.GHashTableMap)translation).put("drop",'@');
      $line=302;
      ((gold.structures.map.GHashTableMap)translation).put("grab",'@');
      $line=303;
      ((gold.structures.map.GHashTableMap)translation).put("get",'@');
      $line=304;
      ((gold.structures.map.GHashTableMap)translation).put("free",'@');
      $line=305;
      ((gold.structures.map.GHashTableMap)translation).put("pop",'@');
      $line=307;
      ((gold.structures.map.GHashTableMap)translation).put("front",'F');
      $line=308;
      ((gold.structures.map.GHashTableMap)translation).put("back",'B');
      $line=309;
      ((gold.structures.map.GHashTableMap)translation).put("left",'L');
      $line=310;
      ((gold.structures.map.GHashTableMap)translation).put("right",'R');
      $line=312;
      ((gold.structures.map.GHashTableMap)translation).put("north",'O');
      $line=313;
      ((gold.structures.map.GHashTableMap)translation).put("south",'O');
      $line=314;
      ((gold.structures.map.GHashTableMap)translation).put("east",'O');
      $line=315;
      ((gold.structures.map.GHashTableMap)translation).put("west",'O');
      $line=317;
      ((gold.structures.map.GHashTableMap)translation).put("if",'i');
      $line=318;
      ((gold.structures.map.GHashTableMap)translation).put("fi",'f');
      $line=319;
      ((gold.structures.map.GHashTableMap)translation).put("else",'e');
      $line=320;
      ((gold.structures.map.GHashTableMap)translation).put("while",'8');
      $line=321;
      ((gold.structures.map.GHashTableMap)translation).put("do",'<');
      $line=322;
      ((gold.structures.map.GHashTableMap)translation).put("od",'>');
      $line=323;
      ((gold.structures.map.GHashTableMap)translation).put("repeatTimes",'r');
      $line=324;
      ((gold.structures.map.GHashTableMap)translation).put("per",'p');
      $line=326;
      ((gold.structures.map.GHashTableMap)translation).put("isFacing",'&');
      $line=327;
      ((gold.structures.map.GHashTableMap)translation).put("isValid",'V');
      $line=328;
      ((gold.structures.map.GHashTableMap)translation).put("canWalk",'C');
      $line=329;
      ((gold.structures.map.GHashTableMap)translation).put("not",'N');
      $line=331;
      ((gold.structures.map.GHashTableMap)translation).put("PROG",'\\');
      $line=332;
      ((gold.structures.map.GHashTableMap)translation).put("GORP",'/');
      $line=333;
      ((gold.structures.map.GHashTableMap)translation).put("PROC",'[');
      $line=334;
      ((gold.structures.map.GHashTableMap)translation).put("CORP",']');
      $line=335;
      ((gold.structures.map.GHashTableMap)translation).put("var",'%');
      $line=337;
      ((gold.structures.map.GHashTableMap)translation).put(":=",'=');
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Lexer202220.class,"initialize",$line);
    }
    return $result;
  }
}