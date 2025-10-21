'use client';
import React, { ReactElement } from 'react';
import Dialog from '@mui/material/Dialog';
import DialogTitle from '@mui/material/DialogTitle';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import Typography from '@mui/material/Typography';
import Chip from '@mui/material/Chip';

function CartDialog({ open, handleClose }: { open: boolean; handleClose: (dialog?: string) => void; }): ReactElement {
    return (
        <Dialog
            open={open}
            onClose={() => handleClose('cart-dialog')}
            scroll='paper'
        >
            <DialogTitle id="scroll-dialog-title">Information</DialogTitle>
            <DialogContent dividers={true}>
                <DialogContentText>
                    <Typography variant="body2" textAlign='center'>
                        Product added to cart
                    </Typography>
                </DialogContentText>
                <Chip
                    sx={{ marginBottom: '1em', marginTop: '1em', display: 'flex', flexDirection: 'row', justifyContent: 'center' }}
                    color='error'
                    clickable
                    label="Close"
                    onClick={() => handleClose('cart-dialog')} />
            </DialogContent>
        </Dialog>
    );
}
export default CartDialog;