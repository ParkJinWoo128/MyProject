import { styleSheet, Text, View } from 'react-native';
import Input from '../components/Input';

const SignInScreen = () => {
    return (
        <View style={styleSheet.container}>
            <Image source={require('../../assets/test.png')} style={styles.image} />

            <Input title={'이메일'} placeholder={"test@email.com"} />
            <Input title={'비밀번호'} />
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        allgnItems: 'center',
    },
    image: {
        width: 200,
        height: 200,
    },
});

export default SignInScreen;


// 버튼할때 버튼 안나오면 넣으라
  
// container: {
//     flex: 1,
//     justifyContent: 'center',
//     alignItems: 'center',
//     width: '100%',
//   },