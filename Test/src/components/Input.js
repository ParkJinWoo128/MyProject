import { styleSheet, Text, TextInput, View } from 'react-native';
import PropTypes from 'prop-types';

export const keyboardTypes = {
    DEFAULT: 'default',
    EMAIL: 'email-address',
}

const Input = ({ title, placeholder, keyboardTypes }) => {
    return (
        <View style={styleSheet.container}>
            <Text style={styleSheet.title}>{title}</Text>
            <TextInput
                style={styleSheet.input}
                placeholder={placeholder ?? title}
                placeholderTextColor={'#a3a3a3'}
                autoCapitalize='none'
                autoCorrect={false}
                keyboadrdType={keyboardTypes}
            />
        </View>
    );
};

Input.defaulProps = {
    keyboardType: keyboardTypes.DEFAULT,
};

Input.PropTypes = {
    title: PropTypes.string.isRequired,
    placeholder: PropTypes.string,
    keyboardType: PropTypes.oneOf(Object.values(keyboardTypes)),
};

const styles = StyleSheet.create({
    container: {
        width: '100%',
        paddingHorizontal: 20,
        marginVertical: 10,
    },
    title: {
        marginBottom: 4,
    },
    input: {
        borderWidth: 1,
        borderRadius: 8,
        paddingHorizontal: 10,
        height: 42,
    },
});

export default Input;

